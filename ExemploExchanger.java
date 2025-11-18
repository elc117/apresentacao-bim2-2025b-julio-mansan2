import java.util.concurrent.Exchanger;

public class ExemploExchanger {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String recebido = exchanger.exchange("Mensagem da Thread A");
                System.out.println("Thread A recebeu: " + recebido);
            } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try {
                String recebido = exchanger.exchange("Mensagem da Thread B");
                System.out.println("Thread B recebeu: " + recebido);
            } catch (Exception e) {}
        }).start();

    }
}