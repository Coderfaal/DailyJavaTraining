package VendingMachine;

public enum VendingMachineState {

    IDLE,                  // Waiting to start
    WAITING_FOR_SELECTION, // Show menu / wait for code
    WAITING_FOR_PAYMENT,   // Product chosen, waiting for enough money
    DISPENSING,            // Ready to dispense
    OUT_OF_STOCK          //NO QUANTITY
}
