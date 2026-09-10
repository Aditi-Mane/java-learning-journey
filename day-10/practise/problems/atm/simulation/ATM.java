package problems.atm.simulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("---Make a choice---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try{
                choice = sc .nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please enter a valid number");
                sc.nextLine();
                continue;
            }
            switch (choice){
                case 1:
                    System.out.print("Current balance: "+BankAccount.checkBalance());
                    System.out.println();
                    break;
                case 2:
                    try{
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        BankAccount.deposit(depositAmount);
                    }catch (InputMismatchException e){
                        System.out.println("Please enter a valid amount");
                    }catch(NegativeAmountException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = sc.nextDouble();
                        BankAccount.withdraw(withdrawalAmount);
                    }catch (InputMismatchException e){
                        System.out.println("Please enter a valid amount");
                    }catch (NegativeAmountException e){
                        System.out.println(e.getMessage());
                    }catch (InsufficientBalanceException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1-4");
                    break;
            }
        }
    }
}

/* OUTPUT

---Make a choice---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 2
Enter deposit amount: hello
Please enter a valid amount

---Make a choice---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: Please enter a valid number

---Make a choice---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 2
Enter deposit amount: -12
Deposit must be greater than 0

---Make a choice---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 3
Enter withdrawal amount: 6000
Error: Insufficient balance

---Make a choice---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 6
Invalid choice. Please select 1-4

---Make a choice---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: hi
Please enter a valid number

 */
