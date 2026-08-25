import java.util.Scanner;

public class CharacterClassification {
    String findCharacter(char character){
        String answer;
        if(character >= 'A' && character <= 'Z'){
            answer = "Upper Case"; // (65–90)
        } else if(character >= 'a' && character <= 'z'){
            answer = "Lower Case"; // (97–122)
        } else if(character >= '0' && character <= '9'){
            answer = "Digit"; // (48–57)
        } else {
            answer = "Special Character";
        }
        return answer;
    }
    public static void main(String[] args) {
        CharacterClassification c = new CharacterClassification();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        String ch = c.findCharacter(character);
        System.out.println(ch);
    }
}
