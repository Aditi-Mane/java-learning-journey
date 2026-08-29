public class SymmetricMatrixCheck {
    static boolean check(int[][] arr, int[][] transpose){
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                if(transpose[i][j] != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{2,4,5},{3,5,6}};

        int[][] transpose = new int[arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                transpose[j][i] = arr[i][j];
            }
        }
        boolean ans = check(arr, transpose);
        System.out.println(ans);
    }
}
