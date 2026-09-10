import java.io.IOException;

public class ExceptionChainingExample {

    static void readFile() throws Exception {
        try {
            throw new IOException("File not found");
        } catch (IOException e) {
            throw new Exception("Unable to load user data", e);
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Main exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
            //getCause() gets the original IOException
        }
    }
}
/* OUTPUT
Main exception: Unable to load user data
Original cause: File not found
 */
