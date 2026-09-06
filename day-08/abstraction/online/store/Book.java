package online.store;

public class Book extends Product implements Shippable, Discountable, Returnable{
    private double percentage;
    private int shippingCharges;

    public Book(String name, double price, int productId, double percentage, int shippingCharges){
        super(name, price, productId);
        if(percentage > 0){
            this.percentage = percentage;
        }
        if(shippingCharges > 0){
            this.shippingCharges = shippingCharges;
        }
    }

    @Override
    double calculatePrice() {
        double discountedPrice = applyDiscount(percentage);
        return discountedPrice + shippingCharges;
    }

    @Override
    public double applyDiscount(double percentage) {
        return getPrice() - (percentage/100) * getPrice();
    }

    @Override
    public void ship() {
        System.out.println("Book shipping charges: "+shippingCharges);
    }

    @Override
    public void processReturn() {
        System.out.println("Book can be processed for a return");
    }
}
