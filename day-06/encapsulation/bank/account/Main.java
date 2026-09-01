package bank.account;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("123RTGH","Aditi Mane");
        BankAccount a2 = new BankAccount("123KLPO", "Ayush Mane", 2356.21);

        a1.deposit(3000);
        a1.withdraw(1000);
        System.out.println(a1.getBalance());

        a2.withdraw(2400);
        System.out.println(a2.getBalance());

        a2.deposit(-23);
        System.out.println(a2.getBalance());

        a1.printDetails();
        System.out.println();

        a2.printDetails();
        System.out.println();

        System.out.println("Total accounts: "+BankAccount.getTotalAccounts());
    }
}
