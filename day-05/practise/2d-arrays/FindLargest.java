public class FindLargest {
    public static void main(String[] args) {
        int[][] arr = {{10,3,4},{9,7,6}};
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println(largest);
    }
}
