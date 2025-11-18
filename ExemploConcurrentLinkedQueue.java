import java.util.concurrent.ConcurrentLinkedQueue;

public class ExemploConcurrentLinkedQueue {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> fila = new ConcurrentLinkedQueue<>();

        fila.add("A");
        fila.add("B");
        fila.add("C");

        System.out.println("Primeiro: " + fila.peek());

        System.out.println("Removido: " + fila.poll());
        System.out.println("Removido: " + fila.poll());

        System.out.println("Tamanho atual: " + fila.size());
    }
}