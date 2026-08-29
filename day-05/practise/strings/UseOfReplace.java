public class UseOfReplace {
    public static void main(String[] args) {
        //remove spaces
        String str = " Java    is    fun   ";
        String answer = str.trim().replaceAll("\\s+","");
        System.out.println(answer);

        //replace every occurrence of a character
        String s = "banana";
        String ans = s.replace('a','e');
        System.out.println(ans);
    }
}
