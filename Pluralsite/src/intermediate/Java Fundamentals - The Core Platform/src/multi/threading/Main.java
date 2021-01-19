package multi.threading;

public class Main {
    private static final String rootResources = "C:\\Users\\sgoud\\JavaProjects\\Learning-Java\\Pluralsite\\src\\intermediate\\Java Fundamentals - The Core Platform\\resources\\threading\\";

    public static void main(String[] args) throws InterruptedException {
        String[] inFiles = {
                rootResources + "inputFile1.txt",
                rootResources + "inputFile2.txt",
                rootResources + "inputFile3.txt",
                rootResources + "inputFile4.txt",
                rootResources + "inputFile5.txt",
                rootResources + "inputFile6.txt"
        };
        String[] outFiles = {
                rootResources + "outputFile1.txt",
                rootResources + "outputFile2.txt",
                rootResources + "outputFile3.txt",
                rootResources + "outputFile4.txt",
                rootResources + "outputFile5.txt",
                rootResources + "outputFile6.txt"
        };
        Thread[] threads = new Thread[inFiles.length];

        for(int i=0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i], outFiles[i]);
            Thread thread = new Thread(adder);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
