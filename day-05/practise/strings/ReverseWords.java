public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = str.trim().split("\\s+");
        int start = 0, end = words.length-1;
        while(start<end){
            String s = words[start];
            words[start] = words[end];
            words[end] = s;
            start++;
            end--;
        }
        String joined = String.join(" ", words);
        System.out.println(joined);
    }
}
