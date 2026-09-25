import java.util.List;

public class TextBlocksExample {
    public static void main(String[] args) {
        String json = """
                {
                  "name": "Aditi",
                  "role": "Java Developer",
                  "experience": 1
                }
                """;
        System.out.println(json);

        var skills = List.of("Java", "SQL", "Spring Boot");
        System.out.println(skills);
    }
}
/* OUTPUT
{
  "name": "Aditi",
  "role": "Java Developer",
  "experience": 1
}

[Java, SQL, Spring Boot]
*/
