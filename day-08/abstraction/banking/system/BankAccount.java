package banking.system;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if(balance > 0){
            this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    //method to display details
    public void displayDetails(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Holder name: "+holderName);
        System.out.println("Balance: "+balance);
    }

    //method to deposit money
    public void depositMoney(double amount){
        if(amount > 0){
            balance = balance + amount;
        } else {
            System.out.println("Enter valid amount to deposit");
        }
    }

    protected void reduceBalance(double amount) {
        balance = balance - amount;
    }
    abstract double calculateInterest();
}
