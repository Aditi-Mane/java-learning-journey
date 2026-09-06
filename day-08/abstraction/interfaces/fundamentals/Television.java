package interfaces.fundamentals;

public class Television implements InternetConnectable{
    @Override
    public void connectToInternet() {
        System.out.println("Television connected to the internet.");
    }
}
