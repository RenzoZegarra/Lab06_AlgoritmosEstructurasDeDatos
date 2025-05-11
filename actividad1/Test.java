package actividad1;

public class Test 
{
    public static void main(String[] args) 
    {
        Stack<Integer> pilaEnteros = new StackArray<>(5);
        Stack<String> pilaCadenas = new StackArray<>(3);

        try 
        {
            pilaEnteros.push(5);
            pilaEnteros.push(8);
            pilaEnteros.push(12);

            System.out.println(pilaEnteros); 
            System.out.println("Top: " + pilaEnteros.top()); 
            System.out.println("Pop: " + pilaEnteros.pop()); 
            System.out.println(pilaEnteros); 

            pilaCadenas.push("Hola");
            pilaCadenas.push("Algo");
            System.out.println(pilaCadenas); 

        } 
        catch (ExceptionIsEmpty e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
