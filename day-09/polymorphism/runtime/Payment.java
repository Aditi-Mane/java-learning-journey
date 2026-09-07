package runtime;

public class Payment {
    public int cost = 100;

    public Payment(){
        System.out.println("Payment class");
    }
    void pay(){
        System.out.println("Payment done.");
    }
    static void parent(){
        System.out.println("I am parent");
    }
}
