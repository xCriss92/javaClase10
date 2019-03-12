package metodosqueue;

public class Init {
    public static void main(String[] args) {
        java.util.Queue<String> colaDeStrings =
             new java.util.LinkedList<String>();
             
        colaDeStrings.add("Primero");
        colaDeStrings.add("Segundo");
        colaDeStrings.add("Tercero");
        colaDeStrings.add("Cuarto");
        
        System.out.println(colaDeStrings.peek());
        System.out.println(colaDeStrings.peek());
        System.out.println(colaDeStrings.peek());
        System.out.println(colaDeStrings.peek());
        System.out.println(colaDeStrings.size());
        
        System.out.println(colaDeStrings.poll());
        System.out.println(colaDeStrings.poll());        
        System.out.println(colaDeStrings.poll());
        System.out.println(colaDeStrings.size());
        
    }
}
