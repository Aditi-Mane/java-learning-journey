package abstractclass.indepth;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 12);
        Shape s2 = new Rectangle("Pink", 30,12);

        s1.displayShapeType();
        s1.displayColor();
        System.out.println("Area: "+s1.calculateArea());

        System.out.println();

        s2.displayShapeType();
        s2.displayColor();
        System.out.println("Area: "+s2.calculateArea());
    }
}

/* OUTPUT
Shape: Circle
Color: Red
Area: 452.3893421169302

Shape: Rectangle
Color: Pink
Area: 360.0
*/
