package runtime;

public class UPIPayment extends Payment{
    @Override
    void pay() {
        System.out.println("Payment done via. UPI.");
    }
}
