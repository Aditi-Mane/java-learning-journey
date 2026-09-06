package banking.system;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Aditi Mane", 2490857);
        s.generateStatement();
        System.out.println();

        CurrentAccount c = new CurrentAccount(102, "Ayush Mane", 897034);
        c.generateStatement();
        System.out.println();

        FixedDepositAccount f = new FixedDepositAccount(103, "Anya Sinha", 23400);
        f.generateStatement();
        System.out.println();

        s.withdraw(2400000);
        System.out.println("After withdrawal: "+s.getBalance());

        s.transfer(300, c);
        System.out.println("After transfer: "+c.getBalance());
    }
}
/* OUTPUT
----- Monthly Statement -----
Account: 101
Holder: Aditi Mane
Balance: 2490857.0
Interest: 99634.28

----- Monthly Statement -----
Account: 102
Holder: Ayush Mane
Balance: 897034.0
Interest: 8970.34

----- Monthly Statement -----
Account: 103
Holder: Anya Sinha
Balance: 23400.0
Interest: 1638.0000000000002

After withdrawal: 90857.0
After transfer: 897334.0
 */
