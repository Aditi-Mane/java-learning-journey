public class ReverseString {
    static String reverse(String str){
        char[] chars = str.toCharArray();

        int start=0, end=chars.length-1;
        while(start<end){
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "hello";
        String ans = reverse(str);
        System.out.println(ans);
    }
}
