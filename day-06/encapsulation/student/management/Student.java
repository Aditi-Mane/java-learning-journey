package student.management;

public class Student {
    //instance variables
    private int rollNo;
    private String name;
    private int marks;
    private static int studentCount;

    //parameterized constructor
    Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

        studentCount++;
    }

    //getters for all fields
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public static int getStudentCount(){
        return studentCount;
    }

    //setters for name and marks
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        } else{
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
        }
    }

    //method to display details
    public void displayDetails(){
        System.out.println("Roll no: "+ this.rollNo);
        System.out.println("Name: "+this.name);
        System.out.println("Marks: "+this.marks);
    }
}
