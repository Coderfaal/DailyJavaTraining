package VendingMachine;

public class Main {


    public static void main(String[] args) {



        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("A1","Diet Coke",30,5));
        vm.addProduct(new Product("A2","Lays",10,8));

        vm.addProduct(new Product("A3","Bingo",15,8));
        vm.addProduct(new Product("A4","Oreo",20,6));

        vm.addProduct(new Product("A5","Pepsi",20,1));

        vm.showProducts();

        System.out.println("\n--- Customer 1 ---");
        vm.selectProduct("A1");
        vm.insertMoney(10);
        vm.insertMoney(20);
        vm.dispense();

        System.out.println("\n--- Customer 2 ---");
        vm.selectProduct("A5");
        vm.insertMoney(50);
        vm.dispense();

        System.out.println("\n--- Customer 3 (out of stock test) ---");
        vm.selectProduct("A5"); // quantity was 1, now 0

        System.out.println("\n--- Logs ---");
        vm.printTransactionLog();

    }
}
