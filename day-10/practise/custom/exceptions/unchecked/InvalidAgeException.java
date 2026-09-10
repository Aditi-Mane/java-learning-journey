package custom.exceptions.unchecked;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
