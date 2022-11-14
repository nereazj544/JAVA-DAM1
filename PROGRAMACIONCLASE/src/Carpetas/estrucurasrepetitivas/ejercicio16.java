package tema2.ejercicios.estrucurasrepetitivas;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejercicio16 {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numerorandom = (int) Math.random()*99+1;
        int numero;
        do {
            numero = Integer.parseInt(in.readLine());
            for (numero < numerorandom){
                System.out.println("El numero introduccido es menor.");
            } else if (numero > numerorandom) {
                System.out.println("El numero introduccido es mayor.");
            }
        } while (numero != numerorandom) {
            System.out.println("El numero aleatorio es " + numerorandom);
        }
        System.out.println("el numero aleatorio es: " + numerorandom );
    }

