public class WaitAndNotify {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> {
            try {
                resource.method1();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            resource.method2();
        });

        t1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        t2.start();
    }
}

class SharedResource {

    synchronized void method1() throws InterruptedException {
        System.out.println("A"); // T1 prints A
        wait(); // calls wait(), releasing the object's lock
        System.out.println("B"); // T1 reacquires the lock and prints B
    }

    synchronized void method2() {
        System.out.println("C"); // T2 acquires the lock and prints C
        notify(); // T2 calls notify() and exits the method, releasing the lock

        // in case of notifyAll(), it wakes up all threads waiting on the object's monitor
    }
}
/* OUTPUT
A
C
B
*/