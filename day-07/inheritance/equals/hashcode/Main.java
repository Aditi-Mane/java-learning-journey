package equals.hashcode;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aditi");
        Student s2 = new Student(101, "Aditi");
        Student s3 = new Student(102, "Rahul");

        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true: since we override equals and hashCode
    }
}
