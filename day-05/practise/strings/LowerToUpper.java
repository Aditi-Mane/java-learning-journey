public class LowerToUpper {
    static String convert(String str){
        char[] chars = str.toCharArray();

        //for modification purposes always use normal for loops
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='a' && chars[i]<='z'){
                chars[i] = (char)(chars[i]-32);
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "hello world";
        String ans = convert(str);
        System.out.println(ans);
    }
}
