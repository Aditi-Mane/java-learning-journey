import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // creating a thread pool with 2 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // execute() - executes a Runnable, return nothing
        executor.execute(() -> {
            System.out.println("Task 1 - Executed using execute()");
        });

        // submit() - submits a Runnable and returns a Future
        Future<?> future1 = executor.submit(() -> {
            System.out.println("Task 2 - Executed using submit()");
        });

        // submit() with Callable - returns a result through Future
        Future<Integer> future2 = executor.submit(() -> { // Callable<Integer>
            System.out.println("Task 3 - Calculating result...");

            Thread.sleep(2000); // can throw InterruptedException

            return 100 + 200;
        });

        // isDone() - checks whether a task has completed
        System.out.println("Task 3 completed? " + future2.isDone());

        // get() - retrieves the result, waiting if necessary
        Integer result = future2.get(); // can throw ExecutionException

        System.out.println("Task 3 result: " + result);

        // checking whether Task 2 has completed
        System.out.println("Task 2 completed? " + future1.isDone());

        // shutdown() - stops accepting new tasks
        executor.shutdown();

        System.out.println("Executor shutdown initiated.");
    }
}