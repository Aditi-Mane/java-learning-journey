package optional;

import java.util.Optional;

public class ExerciseThree {
    public static void main(String[] args) {
        Optional<String> username = Optional.of("Aditi");

        String result = username
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .orElse("Invalid Username");

        System.out.println("Username: "+result);
    }
}
/* OUTPUT
Username: ADITI
*/
