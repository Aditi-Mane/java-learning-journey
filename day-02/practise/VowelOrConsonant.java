import java.util.Scanner;

public class VowelOrConsonant {
    static String findStatus(char ch){
        if (!Character.isLetter(ch)) {
            return "Not a letter";
        }
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return "Vowel";
        }
        return "Consonant";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String answer = VowelOrConsonant.findStatus(ch);
        System.out.println(answer);
    }
}
