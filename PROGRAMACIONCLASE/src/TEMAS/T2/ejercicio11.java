package tema2.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio11 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        double num;
        System.out.println("Introducce un numero");
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        num = Double.parseDouble(in.readLine());
        if (num == 0) {
            System.out.println("El numero es neutro");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es positivo");
        }
        
    }
}
