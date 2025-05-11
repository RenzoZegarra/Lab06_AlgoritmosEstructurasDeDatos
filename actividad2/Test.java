package actividad2;
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new QueueLink<>();

        int opcion;
        do 
        {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Ver Front");
            System.out.println("4. Ver back");
            System.out.println("5. Ver cola");
            System.out.println("6. ¿Está vacía?");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            try 
            {
                switch (opcion) 
                {
                    case 1:
                        System.out.print("Ingrese un valor: ");
                        String valor = scanner.nextLine();
                        queue.enqueue(valor);
                        break;
                    case 2:
                        String eliminado = queue.dequeue();
                        System.out.println("Eliminado: " + eliminado);
                        break;
                    case 3:
                        System.out.println("Frente: " + queue.front());
                        break;
                    case 4:
                        System.out.println("Final: " + queue.back());
                        break;
                    case 5:
                        System.out.println("Cola: " + queue.toString());
                        break;
                    case 6:
                        System.out.println("¿Está vacía?: " + queue.isEmpty());
                        break;
                    case 0:
                        System.out.println("Programa finalizado.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } 
            catch (ExceptionIsEmpty e) 
            {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 0);

        scanner.close();
    }
}
