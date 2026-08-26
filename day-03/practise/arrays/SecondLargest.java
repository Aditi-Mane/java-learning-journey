public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {23, 34, 45, 60};

        int largest=arr[0], secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number is "+secondLargest);
    }
}
