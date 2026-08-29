public class SecondaryDiagonalSum {

    //recognize the pattern between, i and j
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{1,8,9}};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if((i+j) == (arr.length-1)){
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println("Secondary diagonal sum: "+sum);
    }
}
