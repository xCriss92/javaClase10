package clasesystem;

public class Init {
    public static void main(String[] args) {
        // Como pasar argumentos a la consola
        for (String s : args) {
            System.out.println(s);
        }
        // esto es para pasar con -Dkey=value
        System.out.println(System.getProperty("usuario"));
        System.out.println(System.getProperty("password"));
        // Esto es para visualizar todas las variables de entorno
        for (String s : System.getenv().keySet()) {
            System.out.println(s);
            System.out.println(System.getenv(s));
            System.out.println("...........................");
        }
    }
}
