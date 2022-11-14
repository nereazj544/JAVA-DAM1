import java.util.Arrays;

import java.util.Arrays;

public class ejercicio {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Numero elegido al AZAR = " + mostrar(numeros));
    }
    static int mostrar (int [] numeros){
        System.out.println(Arrays.toString(numeros));
        int i = (int) (Math.random()* (numeros.length - 1));
        return numeros[i];
    }
    
}