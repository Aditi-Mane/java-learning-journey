import java.util.Scanner;

public class ProblemOfTheDay {
    void printDetails(String name, int age, float height, double marks){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Marks: "+marks);

        double ageDouble = age; //implicit
        System.out.println("Age in double "+ageDouble);

        int marksInt = (int) marks; //explicit
        System.out.println("Marks in Int "+ marksInt);

        char ch = name.charAt(0);
        int ascii = ch; //implicit
        System.out.println("Ascii value of "+ch+" is "+ascii);

    }
    public static void main(String[] args) {
        ProblemOfTheDay day1 = new ProblemOfTheDay();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter height in cm: ");
        float height = sc.nextFloat();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        day1.printDetails(name, age, height, marks);
    }
}
