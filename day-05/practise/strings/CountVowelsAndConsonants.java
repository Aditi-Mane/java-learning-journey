public class CountVowelsAndConsonants {
    static void count(String str){
        char[] chars = str.toCharArray();
        int vowelCount = 0, consonantCount = 0;
        for(char ch: chars){
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel count is "+vowelCount);
        System.out.println("Consonant count is "+consonantCount);
    }
    public static void main(String[] args) {
        String str = "hello 123 hello";
        count(str);
    }
}
