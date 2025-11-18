import java.util.concurrent.CyclicBarrier;

public class ExemploCyclicBarrier {

    public static void main(String[] args) {

        CyclicBarrier barreira = new CyclicBarrier(3, () ->
            System.out.println("Todas chegaram no ponto! Executando ação final.")
        );

        for (int i = 1; i <= 3; i++) {
            int id = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + id + " chegando...");
                    Thread.sleep((long)(Math.random() * 2000));
                    barreira.await();
                    System.out.println("Thread " + id + " passou da barreira.");
                } catch (Exception e) {}
            }).start();
        }
    }
}
