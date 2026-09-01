package student.management;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(23,"Aditi", 45);
        s1.displayDetails();
        System.out.println();

        Student s2 = new Student(21,"Akshata", 98);
        s2.displayDetails();
        System.out.println();

        Student s3 = new Student(20, "Arya", 56);
        s3.displayDetails();
        System.out.println();

        System.out.println("Total count of students: "+Student.getStudentCount());
        System.out.println();

        //setter validation check
        s1.setMarks(150);
        System.out.println("Aditi's marks: "+s1.getMarks());
        System.out.println();

        s1.setMarks(75);
        System.out.println("Aditi's marks: " + s1.getMarks());
    }
}
/* OUTPUT

Roll no: 23
Name: Aditi
Marks: 45

Roll no: 21
Name: Akshata
Marks: 98

Roll no: 20
Name: Arya
Marks: 56

Total count of students: 3

Invalid marks. Marks must be between 0 and 100.
Aditi's marks: 45 //original value cause of failed validation

Aditi's marks: 75
*/
