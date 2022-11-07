public class VendingMachineTester {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // Fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count: ");
        System.out.println(machine.getTokenCount());
        System.out.println("Expected: . . .");
        System.out.print("Can count: ");
        System.out.println(machine.getCanCount());
        System.out.println("Expected: . . .");





    }
}
