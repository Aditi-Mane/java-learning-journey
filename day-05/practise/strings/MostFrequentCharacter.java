public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "pineapple";
        int maxCount = 0;
        char mostFrequent = ' ';
        for(int i=0;i<str.length();i++){
            int currCount = 0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    currCount++;
                }
            }
            if(currCount>maxCount){
                maxCount = currCount;
                mostFrequent = str.charAt(i);
            }
        }
        System.out.println(mostFrequent);
    }
}
