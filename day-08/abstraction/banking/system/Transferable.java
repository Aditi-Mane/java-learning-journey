package banking.system;

public interface Transferable {
    void transfer(double amount, BankAccount target);
}
