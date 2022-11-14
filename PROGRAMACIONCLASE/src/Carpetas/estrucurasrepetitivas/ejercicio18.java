package tema2.ejercicios.estrucurasrepetitivas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio18 {
    public static void main(String[] args)  {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int  total = 0;
        int edad;
        int mayores18 = 0;
        int alumno = 0;
        do {
            System.out.print("edad: ");
            edad = Integer.parseInt(in.readLine());
            for (edad > 0) {
                total += edad;
                if (edad > 18)
                mayores18++;
                alumno++;
            }
    
        } while (edad >= 0);
        if (total < 0){
            System.out.println("No se han introduccido datos");
            } else{
                System.out.println("Edad media: " + ((float) total / alumno));
                System.out.println("Total: " + total);
                System.out.println("mayores de 18: "+ mayores18);
            }
        }
    }