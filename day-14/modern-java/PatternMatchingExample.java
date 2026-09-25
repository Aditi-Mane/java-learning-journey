public class PatternMatchingExample {
    public static void main(String[] args) {
        Object value = 25;

        if(value instanceof String str){
            System.out.println("Uppercase: "+str.toUpperCase());
            System.out.println("Length: "+str.length());
        } else if(value instanceof Integer num){
            System.out.println("Square num: "+num*num);
        }
    }
}
/* OUTPUT

// if string
Uppercase: HELLO JAVA
Length: 10

// if integer
Square num: 625
*/
