public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a=4, b=2;
        try{
            int ans = a/b;
            System.out.println(a+" / "+b+" = "+ans);
        } catch (ArithmeticException e){
            System.out.println("A number cannot be divided by 0");
        }
    }
}
/* OUTPUT
A number cannot be divided by 0 //error caught
4 / 2 = 2 //when no error encountered
*/
