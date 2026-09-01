package mini.ecommerce.product;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    private static int productCount;

    public Product(int id, String name, double price, int stock){
        this.id = id;
        this.name = name;
        if(price >= 0){
            this.price = price;
        } else {
            System.out.println("Price cannot be negative");
        }
        if(stock >= 0){
            this.stock = stock;
        } else {
            System.out.println("Stock cannot be negative");
        }

        productCount++;
    }

    //copy constructor
    public Product(Product p){

        //no need to rewrite validation
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
        this.stock = p.stock;

        productCount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public static int getProductCount() {
        return productCount;
    }

    //method to add stock
    public void addStock(int quantity){
        if(quantity > 0){
            this.stock = this.stock + quantity;
        } else {
            System.out.println("Quantity must be more than 0.");
        }
    }

    //method to buy stock
    public void buy(int quantity){
        if(quantity > 0){
            if(quantity <= stock){
                this.stock = this.stock - quantity;
            } else {
                System.out.println("Quantity cannot exceed stock.");
            }
        } else {
            System.out.println("Quantity must be more than 0.");
        }
    }

    //method to display product
    public void displayProduct(){
        System.out.println("Product Id: "+this.getId());
        System.out.println("Product Name: "+this.getName());
        System.out.println("Product Price: "+this.getPrice());
        System.out.println("Current stock: "+this.getStock());
        System.out.println();
    }
}
