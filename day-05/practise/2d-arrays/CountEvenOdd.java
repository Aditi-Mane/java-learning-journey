public class CountEvenOdd {
    public static void main(String[] args) {
        int[][] arr = {{10,8,4},{9,7,6}};

        int evenCount = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2==0){
                    evenCount++;
                }
            }
        }
        System.out.println("Even count is "+evenCount);
        System.out.println("Odd count is "+(arr.length*arr[0].length-evenCount));
    }
}
