public class CountWords {
    static void count(String str){
        String[] words = str.trim().split("\\s+");
        System.out.println("Word count is "+words.length);
    }
    public static void main(String[] args) {
        String str = "hello     aditi    mane        ";
        count(str);
    }
}
