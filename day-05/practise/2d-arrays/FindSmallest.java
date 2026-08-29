public class FindSmallest {
    public static void main(String[] args) {
        int[][] arr = {{10,3,4},{9,7,6}};
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<smallest){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println(smallest);
    }
}
