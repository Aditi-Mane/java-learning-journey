package interfaces.fundamentals;

public class Main {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.charge();
        s.connectToInternet();
        System.out.println();

        Laptop l = new Laptop();
        l.charge();
        l.connectToInternet();
        System.out.println();

        Television t = new Television();
        t.connectToInternet();
    }
}
/* OUTPUT
Smartphone is charging...
Smartphone connected to the internet.

Laptop is charging...
Laptop connected to the internet.

Television connected to the internet.
*/
