package actividad3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String, Integer> pq = new PriorityQueueLinkSort<>();

        try {
            System.out.println("Ingrese el número de elementos que desea encolar:");
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.println("Elemento " + (i + 1));
                System.out.print("Dato: ");
                String data = scanner.nextLine();

                System.out.print("Prioridad (entero): ");
                int priority = scanner.nextInt();
                scanner.nextLine();

                pq.enqueue(data, priority);
            }

            System.out.println("\nCola actual: " + pq.toString());

            System.out.println("Elemento al frente: " + pq.front());
            System.out.println("Elemento al final: " + pq.back());

            System.out.println("\nDesencolando elemento con mayor prioridad...");
            String removed = pq.dequeue();
            System.out.println("Elemento eliminado: " + removed);

            System.out.println("Cola después de eliminar: " + pq.toString());

        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
