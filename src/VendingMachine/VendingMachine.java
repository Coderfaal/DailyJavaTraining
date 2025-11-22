package VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static VendingMachine.VendingMachineState.*;

public class VendingMachine {

    private VendingMachineState state = VendingMachineState.IDLE;
    private Map<String,Product> inventory = new HashMap<>();
    private List<String> transactionLog = new ArrayList<>();
    private Product selectedProduct;
    private int amountInserted;


    public VendingMachine(VendingMachineState state, int amountInserted) {
        this.state = state;
        this.amountInserted = amountInserted;
    }

    public VendingMachine() {

    }

    public VendingMachineState getState() {
        return state;
    }








    public void addProduct(Product product) {
        inventory.put(product.getCode(), product);
    }


    public void showProducts() {
        System.out.println("=== Available Products ===");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }


    public void selectProduct(String code) {
        if (state != VendingMachineState.WAITING_FOR_SELECTION
                &&
                state != VendingMachineState.IDLE) {
            System.out.println("Cannot select product in state: " + state);
            return;
        }

        Product product = inventory.get(code);

        if (product == null) {
            System.out.println("Invalid product code: " + code);
            return;
        }

        if (product.getQuantity() <= 0) {
            state = VendingMachineState.OUT_OF_STOCK;
            System.out.println("Product " + product.getName() + " is OUT OF STOCK.");
            return;
        }

        selectedProduct = product;
        amountInserted = 0;
        state = VendingMachineState.WAITING_FOR_PAYMENT;

        System.out.println("Selected: " + selectedProduct.getName() +
                " | Price: ₹" + selectedProduct.getPrice());
        System.out.println("Please insert money.");
    }



    public void insertMoney(int amount) {
        if (state != VendingMachineState.WAITING_FOR_PAYMENT) {
            System.out.println("You cannot insert money in state: " + state);
            return;
        }

        if (amount <= 0) {
            System.out.println("Please insert a positive amount.");
            return;
        }

        amountInserted += amount;
        System.out.println("Inserted: ₹" + amount + " | Total: ₹" + amountInserted);

        int price = selectedProduct.getPrice();
        if (amountInserted >= price) {
            state = VendingMachineState.DISPENSING;
            System.out.println("Enough money inserted. Ready to dispense.");
        } else {
            System.out.println("Need more: ₹" + (price - amountInserted));
        }
    }
    public void cancel() {
        if (state == VendingMachineState.WAITING_FOR_PAYMENT) {
            System.out.println("Cancelling transaction. Refunding: ₹" + amountInserted);
            amountInserted = 0;
            selectedProduct = null;
            state = VendingMachineState.WAITING_FOR_SELECTION;
        } else {
            System.out.println("Nothing to cancel in state: " + state);
        }
    }

    public void dispense() {
        if (state != VendingMachineState.DISPENSING) {
            System.out.println("Not ready to dispense. Current state: " + state);
            return;
        }

        System.out.println("Dispensing: " + selectedProduct.getName());
        selectedProduct.decrementedQuantity();

        int price = selectedProduct.getPrice();
        int change = amountInserted - price;

        if (change > 0) {
            System.out.println("Returning change: ₹" + change);
        }
        // Add to log using collections
        String logEntry = "Sold: " + selectedProduct.getName() +
                " for ₹" + price + " | Change: ₹" + change;
        transactionLog.add(logEntry);

        // Reset
        amountInserted = 0;
        selectedProduct = null;
        state = VendingMachineState.WAITING_FOR_SELECTION;
        System.out.println("Transaction complete. Machine ready for next customer.");
    }

    public void printTransactionLog() {
        System.out.println("=== Transaction Log ===");
        for (String log : transactionLog) {
            System.out.println(log);
        }

}}
