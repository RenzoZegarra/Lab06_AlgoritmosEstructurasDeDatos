package ejercicio1;

import actividad1.Stack;
import actividad1.ExceptionIsEmpty;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de pila desea usar?");
        System.out.println("1. Enteros");
        System.out.println("2. Cadenas");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        if (tipo == 1) 
        {
            Stack<Integer> pila = new StackLink<>();
            int opcion;
            do 
            {
                System.out.println("\n--- MENÚ PILA DE ENTEROS ---");
                System.out.println("1. Push: Insertar");
                System.out.println("2. Pop: Eliminar");
                System.out.println("3. Top: Ver tope");
                System.out.println("4. IsEmpty: Ver si esta vacia");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) 
                {
                    case 1:
                        System.out.print("Ingrese un número entero: ");
                        int valor = scanner.nextInt();
                        pila.push(valor);
                        break;
                    case 2:
                        try {
                            int eliminado = pila.pop();
                            System.out.println("Elemento eliminado: " + eliminado);
                        } catch (ExceptionIsEmpty e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            int tope = pila.top();
                            System.out.println("Elemento en el tope: " + tope);
                        } catch (ExceptionIsEmpty e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("¿Está vacía? " + pila.isEmpty());
                        break;
                }
            } while (opcion != 0);
        } else if (tipo == 2) {
            Stack<String> pila = new StackLink<>();
            int opcion;
            do {
                System.out.println("\n--- MENÚ PILA DE CADENAS ---");
                System.out.println("1. Push: Insertar");
                System.out.println("2. Pop: Eliminar");
                System.out.println("3. Top: Ver tope");
                System.out.println("4. IsEmpty: Ver si esta vacia");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese una cadena: ");
                        String texto = scanner.nextLine();
                        pila.push(texto);
                        break;
                    case 2:
                        try {
                            String eliminado = pila.pop();
                            System.out.println("Elemento eliminado: " + eliminado);
                        } catch (ExceptionIsEmpty e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            String tope = pila.top();
                            System.out.println("Elemento en el tope: " + tope);
                        } catch (ExceptionIsEmpty e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("¿Está vacía? " + pila.isEmpty());
                        break;
                }
            } while (opcion != 0);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
