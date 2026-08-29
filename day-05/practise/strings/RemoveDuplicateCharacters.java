public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            //if this character doesn't already exist in my StringBuilder, append it
            if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
