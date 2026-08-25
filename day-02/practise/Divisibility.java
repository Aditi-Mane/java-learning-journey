import java.util.Scanner;

public class Divisibility {
    static void findDivisibility(int num){
        //order of specificity matters
        if(num%3==0 && num%5==0){
            System.out.println("Divisible by both 3 and 5");
        } else if(num%5==0){
            System.out.println("Divisible by 5");
        } else if(num%3==0){
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Neither divisible by 3 nor 5");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        Divisibility.findDivisibility(num);
    }
}
