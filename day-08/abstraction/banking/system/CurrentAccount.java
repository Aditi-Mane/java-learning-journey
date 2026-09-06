package banking.system;

public class CurrentAccount extends BankAccount implements Withdrawable, Transferable, StatementGeneratable {
    private double interest = 1;

    public CurrentAccount(int accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * (interest/100);
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            reduceBalance(amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }

        return getBalance();
    }

    @Override
    public void transfer(double amount, BankAccount target) {
        withdraw(amount);
        target.depositMoney(amount);
    }

    @Override
    public void generateStatement() {
        System.out.println("----- Monthly Statement -----");
        System.out.println("Account: " + getAccountNumber());
        System.out.println("Holder: " + getHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest: " + calculateInterest());
    }
}
