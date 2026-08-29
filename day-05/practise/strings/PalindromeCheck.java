public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Madam";
        String upperStr = str.toUpperCase();
        int start = 0, end = upperStr.length()-1;
        while(start<end){
            if(upperStr.charAt(start) != upperStr.charAt(end)){
                System.out.println("Not palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
