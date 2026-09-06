package interfaces.fundamentals;

public class Laptop implements Chargeable, InternetConnectable{

    @Override
    public void charge() {
        System.out.println("Laptop is charging...");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Laptop connected to the internet.");
    }
}
