import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyUseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("That's not a number!");
        }finally {
            System.out.println("Closing connection...");
        }
    }
}
/*
//in case of exception

Enter a number: Aditi
That's not a number!
Closing connection...

//in case of valid input

Enter a number: 23
23
Closing connection...
 */
