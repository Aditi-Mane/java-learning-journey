public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 34, 45, 60};
        int target = 60;
        boolean targetFound = false;

        for (int i : arr) {
            if (i == target) {
                targetFound = true;
                break;
            }
        }
        if(targetFound){
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }
    }
}
