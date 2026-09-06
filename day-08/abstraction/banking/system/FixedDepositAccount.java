package banking.system;

public class FixedDepositAccount extends BankAccount implements StatementGeneratable {
    private double interest = 7;

    public FixedDepositAccount(int accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * (interest/100);
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
