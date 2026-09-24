package lambda.expressions;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
}
class CalculatorClass{
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a+b;
        Calculator subtraction = (a, b) -> a-b;
        Calculator multiplication = (a, b) -> a*b;

        System.out.println("Addition: "+addition.calculate(10, 5));
        System.out.println("Subtraction: "+subtraction.calculate(10, 5));
        System.out.println("Multiplication: "+multiplication.calculate(10, 5));
    }
}
/* OUTPUT
Addition: 15
Subtraction: 5
Multiplication: 50
*/
