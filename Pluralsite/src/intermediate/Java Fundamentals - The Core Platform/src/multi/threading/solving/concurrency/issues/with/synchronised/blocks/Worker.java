package multi.threading.solving.concurrency.issues.with.synchronised.blocks;

public class Worker implements Runnable {
    private final BankAccount account;

    public Worker(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(account) {
                account.deposit(10);
            }
            System.out.println("End Balance: " + account.getBalance());
        }
    }
}
