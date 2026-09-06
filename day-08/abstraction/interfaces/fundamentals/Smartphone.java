package interfaces.fundamentals;

public class Smartphone implements Chargeable, InternetConnectable {
    @Override
    public void charge() {
        System.out.println("Smartphone is charging...");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Smartphone connected to the internet.");
    }
}
