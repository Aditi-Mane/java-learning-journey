public class SumOfElements {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{2,3,4},{9,7,6}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum is "+sum);
    }
}
