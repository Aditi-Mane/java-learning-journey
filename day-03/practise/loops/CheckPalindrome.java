import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc .nextInt();

        int temp = num;
        int reverse = 0;
        while(temp>0){
            int r = temp%10;
            reverse = reverse*10 + r;
            temp = temp/10;
        }
        if(reverse == num){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
