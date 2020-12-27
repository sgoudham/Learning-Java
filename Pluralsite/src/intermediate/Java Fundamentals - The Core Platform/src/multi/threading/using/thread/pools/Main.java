package multi.threading.using.thread.pools;

import java.util.concurrent.*;

public class Main {
    private static final String rootResources = "C:\\Users\\sgoud\\JavaProjects\\Learning-Java\\Pluralsite\\src\\intermediate\\Java Fundamentals - The Core Platform\\resources\\threading\\";

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String[] inFiles = {
                rootResources + "inputFile1.txt",
                rootResources + "inputFile2.txt",
                rootResources + "inputFile3.txt",
                rootResources + "inputFile4.txt",
                rootResources + "inputFile5.txt",
                rootResources + "inputFile6.txt"
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future[] results = new Future[inFiles.length];

        for(int i=0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i]);
            results[i] = executorService.submit(adder);
        }

        for (Future<Integer> result : results) {
            System.out.println(result.get());
        }

        executorService.shutdown();
        if (executorService.awaitTermination(60, TimeUnit.SECONDS)) {
            System.out.println("Operations Executed Successfully!");
        }
    }
}
