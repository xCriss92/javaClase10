package enumsvarios;

enum ColoresLuz {
    RED, GREEN, BLUE
}

enum ColoresFotocromia {
    CYAN, MAGENTA, AMARILLO, NEGRO
}

public class Init {
    public static void recibeColor(ColoresFotocromia color) {
        if (color == ColoresFotocromia.CYAN) {
            System.out.println("Vino Cyan");
        }
    }
    public static void main(String[] args) {
        recibeColor(ColoresFotocromia.MAGENTA);
    }
}
