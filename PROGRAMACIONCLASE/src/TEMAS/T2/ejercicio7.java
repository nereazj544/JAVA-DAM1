package tema2.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio7 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        double n1, n2, d, f;
        final double G = 6.673e-11 ;
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("introduce el valor de n1: ");
        n1 = Double.parseDouble(in.readLine());
        System.out.println("introduce el valor de n2: ");
        n2 = Double.parseDouble(in.readLine());
        System.out.println("introduce la distancia: ");
        d = Double.parseDouble(in.readLine());
        f = G * (n1 * n2 / Math.pow(d, 2));
        System.out.println("La fuerza de gravitacion es " + f);
    }
}

