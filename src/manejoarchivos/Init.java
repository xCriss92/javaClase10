package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Init {
    public static void leerStream(Reader lector) throws IOException {
        BufferedReader lectorPorLinea = new BufferedReader(lector);
        
        int x = 1;
        for (String s = lectorPorLinea.readLine(); s != null; s = lectorPorLinea.readLine()) {
            System.out.println(String.valueOf(x) + ">> " +  s);
            x++;
        }        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("c:\\clase10\\archivodetexto.txt");
        System.out.println(f.exists());
        
        Reader lector = new FileReader(f);
        leerStream(new java.io.InputStreamReader(System.in));
    }
}
