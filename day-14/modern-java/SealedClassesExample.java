public class SealedClassesExample {
    public static void main(String[] args) {
        Shape circle = new Circle(24);
        circle.print();
        Shape rectangle = new Rectangle(24, 32);
        rectangle.print();
    }
}

sealed class Shape permits Circle, Rectangle {
    void print(){
        System.out.println("Shape");
    }
}

final class Rectangle extends Shape {
    int length;
    int width;

    Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    void print() {
        System.out.println("Length: "+length);
        System.out.println("Width: "+width+"\n");
    }
}

final class Circle extends Shape {
    int radius;

    Circle (int radius){
        this.radius = radius;
    }

    @Override
    void print() {
        System.out.println("Radius: "+radius+"\n");
    }
}
/* OUTPUT
Radius: 24

Length: 24
Width: 32
*/