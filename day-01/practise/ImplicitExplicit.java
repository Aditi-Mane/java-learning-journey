public class ImplicitExplicit {
    void swap(int a, double b){
        double temp = a; //implicit casting/widening i.e. int -> double
        a = (int) b; //explicit casting/narrowing i.e. double -> int
        b = temp;
        System.out.println("a="+a+" b="+b);
    }
    public static void main(String[] args) {
        ImplicitExplicit d = new ImplicitExplicit();
        int a=10;
        double b=12.34;
        d.swap(a, b);
    }
}
