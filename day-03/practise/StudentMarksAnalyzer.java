import java.util.Scanner;

public class StudentMarksAnalyzer {
    static int calculateTotal(int[] arr){
        int total = 0;
        for(int i: arr){
            total = total + i;
        }
        return total;
    }
    static void calculateAverage(int[] arr){
        int total = calculateTotal(arr);
        double average = (double) total / arr.length;
        System.out.println("Average: "+average);
    }
    static void findHighest(int[] arr){
        int highest = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>highest){
                highest = i;
            }
        }
        System.out.println("Highest: "+highest);
    }
    static void findLowest(int[] arr){
        int lowest = Integer.MAX_VALUE;
        for(int i: arr){
            if(i<lowest){
                lowest = i;
            }
        }
        System.out.println("Highest: "+lowest);
    }
    static void countPassed(int[] arr){
        int passCount = 0;
        for(int i: arr){
            if(i>=35){
                passCount++;
            }
        }
        int failCount = arr.length-passCount;
        System.out.println("Passed: "+passCount);
        System.out.println("Failed: "+failCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking number of subjects from user
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        //taking marks of each subject
        System.out.println("Enter marks: ");
        int[] marks = new int[subjects];
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks);
        System.out.println("Total: "+total);

        calculateAverage(marks);
        findHighest(marks);
        findLowest(marks);
        countPassed(marks);
    }
}
/* OUTPUT:

Enter number of subjects: 5
Enter marks:
23
56
98
12
87
Total: 276
Average: 55.2
Highest: 98
Highest: 12
Passed: 3
Failed: 2

*/
