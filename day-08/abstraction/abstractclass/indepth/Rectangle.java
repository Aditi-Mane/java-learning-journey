package abstractclass.indepth;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void displayShapeType() {
        System.out.println("Shape: Rectangle");
    }
}
