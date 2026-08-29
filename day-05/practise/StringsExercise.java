public class StringsExercise {
    static void getWordCount(String str){
        String[] words = str.trim().split("\\s+");
        System.out.println("Words: "+words.length);
    }
    static void characterCount(String str){
        char[] chars = str.toCharArray();
        System.out.println("Characters: "+chars.length);
    }
    static void firstAndLastCharacter(String str){
        System.out.println("First character: "+str.charAt(0));
        System.out.println("Last character: "+str.charAt(str.length()-1));
    }
    static void reversedString(String str){
        char[] chars = str.toCharArray();
        int start=0, end=chars.length-1;
        while(start<end){
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }
        System.out.println("Reversed string: " + new String(chars));
    }
    static void javaOccurrences(String str){
        int count = 0;
        for(int i=0;i<=str.length()-4;i++){
            if(str.startsWith("Java", i)){
                count++;
            }
        }
        System.out.println("Java occurrences: "+count);
    }
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        getWordCount(str);
        characterCount(str);
        firstAndLastCharacter(str);
        reversedString(str);
        javaOccurrences(str);
    }
}
