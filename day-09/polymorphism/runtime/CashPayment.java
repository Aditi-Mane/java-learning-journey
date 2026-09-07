package runtime;

public class CashPayment extends Payment{
    public int cost = 150;

    public CashPayment(){
        System.out.println("Cash Payment class");
    }
    @Override
    void pay() {
        System.out.println("Payment done via. Cash.");
    }
    void paymentStatus(){
        System.out.println("Payment successfully done via. Cash.");
    }

    static void parent(){
        System.out.println("I am child");
    }
}
