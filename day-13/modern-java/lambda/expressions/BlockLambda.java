package lambda.expressions;

@FunctionalInterface
public interface BlockLambda {
    int calculate(int x, int y);
}
class BlockLambdaClass{
    public static void main(String[] args) {
        BlockLambda addition = (x,y) -> {
            int result = x+y;
            return result;
        };
        int ans = addition.calculate(10, 5);
        System.out.println("Addition: "+ans);
    }
}
/* OUTPUT
Addition: 15
*/
