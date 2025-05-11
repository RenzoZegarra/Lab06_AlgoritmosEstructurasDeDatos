package ejercicio2;

import actividad2.ExceptionIsEmpty;
import actividad2.Queue;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad máxima de la cola: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Qué tipo de cola desea usar?");
        System.out.println("1. Enteros");
        System.out.println("2. Cadenas");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            Queue<Integer> cola = new QueueArray<>(capacidad);
            menuEnteros(scanner, cola);
        } else if (tipo == 2) {
            Queue<String> cola = new QueueArray<>(capacidad);
            menuCadenas(scanner, cola);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static void menuEnteros(Scanner scanner, Queue<Integer> cola) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ COLA DE ENTEROS ---");
            System.out.println("1. Enqueue: Insertar");
            System.out.println("2. Dequeue: Eliminar");
            System.out.println("3. Front: Frente");
            System.out.println("4. Back: Final");
            System.out.println("5. IsEmpty: vacía");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int valor = scanner.nextInt();
                    cola.enqueue(valor);
                    break;
                case 2:
                    try {
                        int eliminado = cola.dequeue();
                        System.out.println("Elemento eliminado: " + eliminado);
                    } catch (ExceptionIsEmpty e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Frente: " + cola.front());
                    } catch (ExceptionIsEmpty e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Final: " + cola.back());
                    } catch (ExceptionIsEmpty e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("¿Está vacía? " + cola.isEmpty());
                    break;
                case 0:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static void menuCadenas(Scanner scanner, Queue<String> cola) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ COLA DE CADENAS ---");
            System.out.println("1. Enqueue: Insertar");
            System.out.println("2. Dequeue: Eliminar");
            System.out.println("3. Front: Frente");
            System.out.println("4. Back: Final");
            System.out.println("5. IsEmpty: vacía");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una cadena: ");
                    String texto = scanner.nextLine();
                    cola.enqueue(texto);
                    break;
                case 2:
                    try {
                        String eliminado = cola.dequeue();
                        System.out.println("Elemento eliminado: " + eliminado);
                    } catch (ExceptionIsEmpty e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Frente: " + cola.front());
                    } catch (ExceptionIsEmpty e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Final: " + cola.back());
                    } catch (ExceptionIsEmpty e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("¿Está vacía? " + cola.isEmpty());
                    break;
                case 0:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
