package interfaces.indepth;

public class UPIPayment implements Payment {
    public void pay(double amount){
        System.out.println("UPI payment done of Rs."+amount);
    }
    @Override
    public void printReceipt() {
        System.out.println("UPI payment receipt generated.");
    }
}
