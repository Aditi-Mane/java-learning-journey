package problems.login.system;

public class FailedAttemptsException extends Exception {
    public FailedAttemptsException(String message) {
        super(message);
    }
}
