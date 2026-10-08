public class RaceConditionsExercise {
    public static void main(String[] args) throws InterruptedException {
        Count counter = new Count();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<100;i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<100;i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: "+counter.count);

    }
}
class Count {
    int count = 0;
    // static synchronized -> both objects of a class use the same lock
    // synchronized method -> method allows only one thread to access at a time on a particular object
    // synchronized(this) -> locks only the current object instead of the entire method
    // synchronized(lock) -> lock is on object associated specifically with the current object

    synchronized void increment() { // BLOCKED
        int temp = count;

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        count = temp + 1;
    }
}
