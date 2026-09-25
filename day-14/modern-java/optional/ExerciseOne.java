package optional;

import java.util.Optional;

public class ExerciseOne {
    public static void main(String[] args) {
        String name = null;

        // Convert it into an Optional<String> safely.
        Optional<String> nameSafe = Optional.ofNullable(name);

        // Print whether the value is present.
        System.out.println("Is name present?: "+nameSafe.isPresent());

        // Print the value, or "Guest" if it's missing.
        System.out.println("Name: "+nameSafe.orElse("Guest"));

        // Then change name to "Aditi" and verify the output changes.
        name = "Aditi";
        nameSafe = Optional.ofNullable(name);

        System.out.println("Name: " + nameSafe.orElse("Guest"));
    }
}
/* OUTPUT
Is name present?: false
Name: Guest
Name: Aditi
*/
