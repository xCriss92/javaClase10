package fueradememoria;

import java.util.ArrayList;

public class Init {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        
        int x = 1;
        for (;;) {
            lista.add(String.valueOf(x));
            System.out.println(lista.size());
            x++;
        }
    }
}
