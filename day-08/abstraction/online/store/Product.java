package online.store;

abstract class Product {
    private String name;
    private double price;
    private int productId;

    public Product(String name, double price, int productId){
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public double getPrice(){
        return price;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Product ID: "+productId);
    }

    abstract double calculatePrice();
}
