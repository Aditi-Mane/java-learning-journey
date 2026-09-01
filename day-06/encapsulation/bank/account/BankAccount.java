package bank.account;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private static int totalAccounts;

    public BankAccount(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;

        totalAccounts++;
    }
    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if(balance >= 0){
            this.balance = balance;
        } else{
            System.out.println("Balance can never be negative.");
        }

        totalAccounts++;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        } else {
            System.out.println("You cannot deposit a negative amount.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0){
            if(amount <= balance){
                this.balance = this.balance - amount;
            } else {
                System.out.println("You cannot withdraw more than balance amount.");
            }
        } else {
            System.out.println("You cannot withdraw a negative amount");
        }
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void printDetails(){
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Account Holder: "+getAccountHolder());
        System.out.println("Balance: "+getBalance());
    }
}
