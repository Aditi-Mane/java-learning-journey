package abstractclass.indepth;

abstract class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }
    void displayColor(){
        System.out.println("Color: "+color);
    }
    abstract double calculateArea();
    abstract void displayShapeType();
}
