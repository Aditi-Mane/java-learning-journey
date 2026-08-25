import java.util.Scanner;

public class SwitchCalculator {
    static void calculate(int num1, int num2, char operator){
        int answer = 0;
        boolean isValidOperator= true;
        switch (operator){
            case '+':
                answer = num1+num2;
                break;
            case '-':
                answer = num1-num2;
                break;
            case '*':
                answer = num1*num2;
                break;
            case '/':
                answer = num1/num2;
                break;
            default:
                isValidOperator=false;
                System.out.println("Not a valid operator");
        }
        if(isValidOperator){
            System.out.println(num1 +" "+operator+" "+num2+" = "+answer);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        SwitchCalculator.calculate(num1, num2, operator);
    }
}
