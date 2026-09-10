package problems.login.system;

public class WrongCredentialsException extends RuntimeException{
    public WrongCredentialsException(String msg){
        super(msg);
    }
}
