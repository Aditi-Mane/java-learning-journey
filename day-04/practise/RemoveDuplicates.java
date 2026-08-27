import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,2};
        int i=0;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        int[] answer = new int[i];
        for(int k=0;k<answer.length;k++){
            answer[k] = arr[k];
        }
        System.out.println(Arrays.toString(answer));
    }
}

