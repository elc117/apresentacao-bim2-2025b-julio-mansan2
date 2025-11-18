import java.util.concurrent.Semaphore;

public class ExemploSemaphore {

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);

        for (int i = 1; i <= 5; i++) {
            int id = i;
            new Thread(() -> {
                try {
                    sem.acquire();
                    System.out.println("Thread " + id + " entrou.");
                    Thread.sleep(1000);
                    System.out.println("Thread " + id + " saiu.");
                } catch (Exception e) {}
                finally {
                    sem.release();
                }
            }).start();
        }
    }
}