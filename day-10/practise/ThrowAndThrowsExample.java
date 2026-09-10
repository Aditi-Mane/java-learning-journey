import java.util.Scanner;

public class ThrowAndThrowsExample {
    void validAge(int age) throws IllegalArgumentException{
        if(age <= 18){
            throw new IllegalArgumentException("Minor");
        }
        System.out.println("Adult");
    }

    public static void main(String[] args) {
        ThrowAndThrowsExample th = new ThrowAndThrowsExample();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            th.validAge(age);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
/* OUTPUT
Enter age: 19
Adult

Enter age: 16
Minor
 */
