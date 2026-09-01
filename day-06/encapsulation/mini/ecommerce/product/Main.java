package mini.ecommerce.product;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000.0, 5);
        Product p2 = new Product(102, "Mouse", 1000.0, 20);
        Product p3 = new Product(103, "Keyboard", 3000.0, 10);

        //buy 2 laptops
        p1.buy(2);

        //buy 10 mice
        p2.buy(10);

        //try buying 10 laptops again
        p1.buy(10);

        //add 5 laptops
        p1.addStock(5);
        System.out.println("Laptops current stock: "+p1.getStock());
        System.out.println();

        //get product count
        System.out.println("Total products count: "+Product.getProductCount());
        System.out.println();

        //display product info
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        //copy constructor
        Product p4 = new Product(p3);
        p4.addStock(10);

        System.out.println(p3.getStock());
        System.out.println(p4.getStock());
    }
}
/* OUTPUT

Quantity cannot exceed stock.
Laptops current stock: 8

Total products count: 3

Product Id: 101
Product Name: Laptop
Product Price: 50000.0
Current stock: 8

Product Id: 102
Product Name: Mouse
Product Price: 1000.0
Current stock: 10

Product Id: 103
Product Name: Keyboard
Product Price: 3000.0
Current stock: 10

10
20
 */
