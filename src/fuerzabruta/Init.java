package fuerzabruta;

import java.util.Random;

public class Init {
    public static void main(String[] args) {
        for (;;) {
            int x = new Random().nextInt(100);
            System.out.println(x);
        }
    }
}
