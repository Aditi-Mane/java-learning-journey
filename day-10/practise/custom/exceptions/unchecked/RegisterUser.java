package custom.exceptions.unchecked;

import java.util.Scanner;

public class RegisterUser {
    static void registerUser(int age){
        if(age < 18){
            throw new InvalidAgeException("Registration failed: Age must be 18 or above");
        }
        System.out.println("Registration successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            registerUser(age);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
/* OUTPUT
Enter age: 16
Registration failed: Age must be 18 or above

Enter age: 19
Registration successful
 */
