package problems.atm.simulation;

public class BankAccount {
    private static double balance = 5000.0;

    public static double checkBalance(){
        return balance;
    }

    public static void deposit(double amount){
        //handle negative deposit
        if(amount <= 0){
            throw new NegativeAmountException("Deposit must be greater than 0");
        }
        balance = balance + amount;
        System.out.println("Amount deposited: "+amount);
    }

    public static void withdraw(double amount){
        //handle negative withdrawal
        if(amount <= 0){
            throw new NegativeAmountException("Withdrawal amount must be greater than 0");
        }

        //handle insufficient balance
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance = balance - amount;
        System.out.println("Withdrawal amount: "+amount);
    }
}
