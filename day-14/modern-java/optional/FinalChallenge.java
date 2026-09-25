package optional;

import java.util.Optional;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class FinalChallenge {
    public static void main(String[] args) {
        Optional<User> user = Optional.of(new User("Aditi", "aditi-example.com"));

        // Get the user's email
        String email = user.map(User::getEmail)
                .filter(e -> e.contains("@"))
                .map(String::toLowerCase)
                .orElse("No valid email");

        System.out.println("User's email: "+email);
    }
}
/* OUTPUT
User's email: No valid email
*/
