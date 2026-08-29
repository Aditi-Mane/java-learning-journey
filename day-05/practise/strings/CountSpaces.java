public class CountSpaces {
    static void count(String str){
        int spaceCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                spaceCount++;
            }
        }
        System.out.println("Space count is "+spaceCount);
    }
    public static void main(String[] args) {
        String str = "manifestation 101";
        count(str);
    }
}
