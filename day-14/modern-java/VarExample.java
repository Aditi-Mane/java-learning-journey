import java.util.Arrays;
import java.util.HashMap;

public class VarExample {
    public static void main(String[] args) {
        var name = "Aditi";
        var age = 22;
        var list = Arrays.asList("Aditi", "Ayush", "Aman");
        var studentsMarks = new HashMap<String, Integer>();
        studentsMarks.put("Aditi", 98);
        studentsMarks.put("Ayush", 90);
        studentsMarks.put("Aman", 86);

        System.out.println(name);
        System.out.println(age);
        System.out.println(list);
        System.out.println(studentsMarks);
    }
}
/* OUTPUT
Aditi
22
[Aditi, Ayush, Aman]
{Aman=86, Aditi=98, Ayush=90}
*/
