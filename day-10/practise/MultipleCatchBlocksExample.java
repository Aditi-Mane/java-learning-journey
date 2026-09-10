import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocksExample {
    public static void main(String[] args) {
         int[] arr = {23,0,4,67,80};

        Scanner sc = new Scanner(System.in);

        try{
            int index ,num;
            System.out.print("Enter index: ");
            index = sc.nextInt();

            System.out.print("Enter number: ");
            num = sc.nextInt();

            int ans = num/arr[index];
            System.out.println(num+" / "+arr[index]+" = "+ans);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter an index in bounds of array length");
        } catch (InputMismatchException e){
            System.out.println("Number entered is not valid");
        } catch (ArithmeticException e){
            System.out.println("A number cannot be divided by zero");
        }
    }
}
/* OUTPUT
Enter index: 5
Enter number: 23
Enter an index in bounds of array length //1

Enter index: 4
Enter number: Hi
Number entered is not valid //2

Enter index: 1
Enter number: 23
A number cannot be divided by zero //3
 */
