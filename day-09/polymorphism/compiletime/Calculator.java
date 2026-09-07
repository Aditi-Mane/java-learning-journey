package compiletime;

public class Calculator {
    public void add(int a , int b){
        System.out.println("Sum of 2 int numbers: "+(a+b));
    }
    public void add(int p, int q, int r){
        System.out.println("Sum of 3 int numbers: "+(p+q+r));
    }
    public static void add(double x, double y){
        System.out.println("Sum of 2 double numbers: "+(x+y));
    }

    public void add(String first, String second) {
        System.out.println("Concatenation: "+first+second);
    }

    public void add(String first, Integer second) {
        System.out.println("String + Integer");
    }
}
