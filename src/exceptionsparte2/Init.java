package exceptionsparte2;

class ErrorImpar extends Exception {
}

class ErrorPar extends Exception {
}

public class Init {
    public static void evaluar(int x) throws ErrorImpar, ErrorPar, Exception {
        ErrorImpar imp = new ErrorImpar();
        ErrorPar par = new ErrorPar();
        Exception cero = new Exception("es cero");
        
        if (x==11) {
            return;
        }
        
        if (x == 0) {
            throw cero;
        }
        
        if (x % 2 == 0) {
            throw par;
        }
        if (x % 2 != 0) {
            throw imp;
        }
    }
    public static void main(String[] args) {
        try {
            evaluar(-111);
        }
        catch (ErrorImpar exImpar) {
            System.out.println("fallo x impar");
        }
        catch (ErrorPar exPar) {
            System.out.println("fallo x par");
        }
        catch (Exception ex) {
            System.out.println("fallo x 0");
        }
        finally {
            System.out.println("Se ejecuta simpre aunque no halla error");
        }
        
    }
}
