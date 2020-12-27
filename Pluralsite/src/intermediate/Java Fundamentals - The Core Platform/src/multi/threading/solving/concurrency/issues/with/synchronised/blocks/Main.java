package multi.threading.solving.concurrency.issues.with.synchronised.blocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        BankAccount account = new BankAccount(100);

        for (int i = 0; i <= 10; i++) {
            Worker worker = new Worker(account);
            executorService.submit(worker);
        }

        executorService.shutdown();
        if (executorService.awaitTermination(60, TimeUnit.SECONDS)) {
            System.out.println("Operations Executed Successfully!");
        }
    }
}
