public class ThreadsExerciseTwo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {
            for(int i=1;i<=5;i++){
                System.out.print(i+" ");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable task2 = () -> {
            for(int i=1;i<=5;i++){
                System.out.print(i+" ");

                try {
                    Thread.sleep(500); // TIMED_WAITING
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t1 = new Thread(task1); // NEW
        Thread t2 = new Thread(task2);

        t1.start(); // RUNNABLE
        t2.start();

        t1.join(); // WAITING
        t2.join();
        System.out.println();

        System.out.println("All tasks completed"); // TERMINATED
    }
}
/* OUTPUT
1 1 2 2 3 3 4 4 5 5
All tasks completed
 */
