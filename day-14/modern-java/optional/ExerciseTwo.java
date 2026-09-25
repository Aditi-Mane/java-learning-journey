package optional;

import java.util.Optional;

public class ExerciseTwo {
    public static void main(String[] args) {

        // Print the username using ifPresent()
        Optional<String> username = Optional.empty();
        username.ifPresent(value -> {
            System.out.println("Username: "+value);
        });

        // Use ifPresentOrElse() to print the username if present, otherwise "No username found"
        username.ifPresentOrElse(value ->
                System.out.println("Username: "+value), () -> System.out.println("No username found")
        );

        // Use orElseGet() to provide "Guest" if the Optional is empty
        System.out.println("Username: "+username.orElseGet(() -> "Guest"));

        // Use orElseThrow() to throw an exception with the message "Username is required" if it's empty
        String value = username.orElseThrow(() ->
                new IllegalArgumentException("Username is required"));

        System.out.println("Username: " + value);
    }
}
/* OUTPUT
No username found
Username: Guest
Exception in thread "main" java.lang.IllegalArgumentException: Username is required
	at optional.ExerciseTwo.lambda$main$4(ExerciseTwo.java:27)
	at java.base/java.util.Optional.orElseThrow(Optional.java:403)
	at optional.ExerciseTwo.main(ExerciseTwo.java:26)
*/
