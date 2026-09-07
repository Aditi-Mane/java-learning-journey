package runtime;

public class CreditCardPayment extends Payment{
    @Override
    void pay() {
        System.out.println("Payment done via. Credit Card.");
    }
}
