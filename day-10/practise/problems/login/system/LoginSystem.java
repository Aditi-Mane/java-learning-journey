package problems.login.system;

public class LoginSystem {
    int failedAttempts = 0;
    void validate(String enteredUsername, String enteredPassword, String correctUsername, String correctPassword) throws FailedAttemptsException{
        if(enteredUsername.trim().isEmpty()){
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if(enteredPassword.trim().isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty");
        }
        if (!correctUsername.equals(enteredUsername) ||
                !correctPassword.equals(enteredPassword)) {
            failedAttempts++;
            if (failedAttempts >= 3) {
                throw new FailedAttemptsException("Failed attempts exceeded 3");
            }
            throw new WrongCredentialsException("Invalid username and password");
        }
    }

    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();

        String correctUsername = "admin";
        String correctPassword = "1234";

        String enteredUsername = "admin";
        String enteredPassword = "wrong";

        try {
            login.validate(enteredUsername, enteredPassword, correctUsername, correctPassword);

        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());

        } catch (WrongCredentialsException e) {
            System.out.println("Login Error: " + e.getMessage());

        } catch (FailedAttemptsException e) {
            System.out.println("Account Locked: " + e.getMessage());

        }
    }
}
