package runtime;

public class Main {
    public static void main(String[] args) {

        // Parent reference pointing to a child object.
        // This enables runtime polymorphism.
        Payment p1 = new CreditCardPayment();

        // Compiler sees p1 as Payment, but at runtime Java sees
        // the actual object as CreditCardPayment and calls its overridden pay().
        p1.pay();


        Payment p2 = new UPIPayment();

        // Runtime determines which overridden pay() implementation to execute.
        p2.pay();


        Payment p3 = new CashPayment();

        // Runtime calls CashPayment's overridden pay() method.
        p3.pay();


        // Fields are NOT polymorphic.
        // The reference type (Payment) determines which field is accessed.
        System.out.println(p3.cost); // 100


        // Static methods are NOT overridden.
        // They are resolved using the reference type at compile time.
        p3.parent(); // Payment.parent() → "I am parent"


        // paymentStatus() exists only in CashPayment.
        // The compiler cannot access it through a Payment reference.
        //
        // p3.paymentStatus(); // Compile-time error
    }
}

/* OUTPUT
Payment class
Payment done via. Credit Card.

Payment class
Payment done via. UPI.

Payment class
Cash Payment class
Payment done via. Cash.

100
I am parent
*/