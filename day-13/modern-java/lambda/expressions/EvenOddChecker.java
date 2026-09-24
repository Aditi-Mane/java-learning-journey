package lambda.expressions;

@FunctionalInterface
public interface EvenOddChecker {
    boolean check(int number);
}
class EvenOddCheckerClass{
    public static void main(String[] args) {
        EvenOddChecker isEven = number -> number % 2 == 0;
        EvenOddChecker isPositive = number -> number > 0;

        System.out.println("Is number even?: "+isEven.check(10));
        System.out.println("Is number positive?: "+isPositive.check(-5));
    }
}
/* OUTPUT
Is number even?: true
Is number positive?: false
*/
