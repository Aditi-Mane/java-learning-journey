package interfaces.indepth;

public interface Payment {

    //implicit abstract and public method
    void pay(double amount);

    //default method: "default" indicates fallback implementation
    default void printReceipt() {
        System.out.println("Payment receipt generated.");
    }

    //static method
    static void paymentGatewayInfo() {
        System.out.println("Payment processed through secure gateway.");
    }
}
