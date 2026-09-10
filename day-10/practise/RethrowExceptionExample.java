public class RethrowExceptionExample {
    static void processPayment() {

        try {
            //payment logic
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Logging: " + e.getMessage());

            throw e; //rethrow
        }
    }

    public static void main(String[] args) {

        try {
            processPayment();

        } catch (ArithmeticException e) {
            System.out.println("Payment failed. Please try again.");
        }
    }
}
/* OUTPUT
Logging: / by zero
Payment failed. Please try again.
 */
