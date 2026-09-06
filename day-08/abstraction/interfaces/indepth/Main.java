package interfaces.indepth;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        c.pay(2309);
        c.printReceipt();
        System.out.println();

        UPIPayment u = new UPIPayment();
        u.pay(987);
        u.printReceipt();
        System.out.println();

        Payment.paymentGatewayInfo();
    }
}
/* OUTPUT
Credit card payment done of Rs.2309.0
Payment receipt generated.

UPI payment done of Rs.987.0
UPI payment receipt generated.

Payment processed through secure gateway.
 */
