import java.util.concurrent.CountDownLatch;

public class ExemploCountDownLatch {
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(3);

        for (int i = 1; i <= 3; i++) {
            int id = i;
            new Thread(() -> {
                System.out.println("Thread " + id + " terminou tarefa.");
                latch.countDown();
            }).start();
        }

        System.out.println("Esperando todas as tarefas...");
        latch.await();
        System.out.println("Todas terminaram!");
    }
}