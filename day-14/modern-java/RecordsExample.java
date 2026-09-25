public class RecordsExample {
    public static void main(String[] args) {
        record Student (String name, int marks) {};

        Student s1 = new Student("Aditi Mane", 98);
        Student s2 = new Student("Ayush Mane", 88);
        Student s3 = new Student("Aditi Mane", 98);

        System.out.println(s1.name() +" -> "+s1.marks());
        System.out.println(s2.name() +" -> "+s2.marks());

        System.out.println(s1);

        System.out.println(s1.equals(s3));
    }
}
/* OUTPUT
Aditi Mane -> 98
Ayush Mane -> 88
Student[name=Aditi Mane, marks=98]
true
*/
