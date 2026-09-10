package custom.exceptions.checked;

import java.util.Scanner;

public class BalanceCheck {
    static void withdraw(double amount, double balance) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance-=amount;
        System.out.println("Withdraw successful, current balance: "+balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            double balance = 5600.90;
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            withdraw(amount, balance);
        } catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
/* OUTPUT
Enter amount to withdraw: 6000
Insufficient balance

Enter amount to withdraw: 600
Withdraw successful, current balance: 5000.9
 */
