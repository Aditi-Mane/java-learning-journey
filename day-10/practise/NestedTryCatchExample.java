import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 0, 40};

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            try {
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                int result = num / arr[index];

                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}
/* OUTPUT
Enter index: 5
Enter number: 23
Invalid array index

Enter index: 2
Enter number: 23
Cannot divide by zero
 */