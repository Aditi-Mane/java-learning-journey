package interfaces.indepth;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Credit card payment done of Rs."+amount);
    }
}
