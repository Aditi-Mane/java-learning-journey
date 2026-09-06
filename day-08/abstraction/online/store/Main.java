package online.store;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Percy Jackson", 230.56, 101, 5.2, 100);
        b.displayDetails();
        System.out.println("Price with discount and shippingCharges: "+b.calculatePrice());
        System.out.println("Custom discount price: "+b.applyDiscount(3.2));
        b.ship();
        b.processReturn();
        System.out.println();

        Electronics e = new Electronics("Arduino uno", 2400, 102, 20, 50);
        e.displayDetails();
        System.out.println("Price with discount and shippingCharges: "+e.calculatePrice());
        System.out.println("Custom discount price: "+e.applyDiscount(4));
        e.ship();
        e.processReturn();
        System.out.println();

        Clothing c = new Clothing("Emerald One piece", 2300.2, 103, 10, 150);
        c.displayDetails();
        System.out.println("Price with discount and shippingCharges: "+c.calculatePrice());
        System.out.println("Custom discount price: "+c.applyDiscount(3.2));
        c.ship();
    }
}
/* OUTPUT
Name: Percy Jackson
Price: 230.56
Product ID: 101
Price with discount and shippingCharges: 313.37088
Custom discount price: 223.18208
Book shipping charges: 100
Book can be processed for a return

Name: Arduino uno
Price: 2400.0
Product ID: 102
Price with discount and shippingCharges: 1960.0
Custom discount price: 2304.0
Electronics shipping charges: 50
Electronics can be processed for a return

Name: Emerald One piece
Price: 2300.2
Product ID: 103
Price with discount and shippingCharges: 2205.18
Custom discount price: 2226.5935999999997
Clothing shipping charges: 150
*/