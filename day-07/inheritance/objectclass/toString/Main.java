package objectclass.toString;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Aditi Mane", 67.9);
        System.out.println(s);
    }
}
/* OUTPUT

objectclass.toString.Student@53d8d10a //when toString() not overridden -> default value of Object.toString();

ID: 101, Name: Aditi Mane, Marks: 67.9 //when toString() overridden
 */
