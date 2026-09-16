package generics;

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> stringBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(10.5);

        System.out.println(intBox.getValue());
        System.out.println(stringBox.getValue());
        System.out.println(doubleBox.getValue());
    }
}
class Box<T>{
    T value;

    public Box(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }
}
/* OUTPUT
100
Hello
10.5
*/
