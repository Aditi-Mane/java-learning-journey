public class ThreadsExerciseOne {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Downloading...");
        };

        Runnable task2 = () -> {
            System.out.println("Processing...");
        };

        Runnable task3 = () -> {
            System.out.println("Uploading...");
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
/* OUTPUT
Downloading...
Uploading...
Processing...

Runnable = WHAT should be done
Thread   = WHO/WHERE executes it
start()  = START executing it concurrently
*/
