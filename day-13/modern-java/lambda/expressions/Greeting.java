package lambda.expressions;

// functional interface with one abstract method
@FunctionalInterface
public interface Greeting {
    void greet(String name);
}

class GreetingClass {
    public static void main(String[] args) {

        // greeting is a reference variable of type Greeting that refers to the lambda implementation
        Greeting greeting = name -> System.out.println("Hello, " + name);
        greeting.greet("Aditi");
    }
}
/* OUTPUT
Hello, Aditi
*/
