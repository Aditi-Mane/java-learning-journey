import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "banana";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        int characterCount = 0;
        for(int i=0;i<str.length();i++){
            if(ch == str.charAt(i)){
                characterCount++;
            }
        }
        System.out.println(ch+" occurs "+characterCount+" times ");
    }
}
