public class CountFrequency {
    static void countFreq(int[] arr){
        boolean[] counted = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int count = 0;
            if(counted[i]){
                continue;
            }
            for(int j=i;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    counted[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" occurs "+count+" times in the array");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        countFreq(arr);
    }
}
