package stackoverflow;

public class Init {
    public static void m1() {
        System.out.println("HOLA");
        m1();
    }
    public static void main(String[] args) {
        m1();
    }
}
