package eje;

import java.util.Scanner;
import java.util.List;

public class PruebaPalabras {
	
	public static void main(String[] args) {
	    Palabras palabras = new Palabras();
	    Scanner sc = new Scanner(System.in);
	    String cmd = "";

	    while (!cmd.equals("fin")) {
	        System.out.println("Introduzca un comando (añadir, lista n, borrar, borrar: ..., fin):");
	        cmd = sc.nextLine();
	        String[] partesCmd = cmd.split(":");
	        if (partesCmd[0].equals("añadir")) {
	            if (partesCmd.length > 1) {
	                palabras.agrPalabras(partesCmd[1]);
	            } else {
	                System.out.println("Debe indicar palabras a añadir después del ':'");
	            }
	        } else if (partesCmd[0].equals("lista")) {
	            if (partesCmd.length > 1) {
	                try {
	                    int longitud = Integer.parseInt(partesCmd[1].trim());
	                    List<String> palabrasPorLongitud = palabras.obtenerPalabrasPorLongitud(longitud);
	                    if (palabrasPorLongitud.isEmpty()) {
	                        System.out.println("No hay palabras de longitud " + longitud);
	                    } else {
	                        System.out.println("Palabras de longitud " + longitud + ":");
	                        palabrasPorLongitud.forEach(System.out::println);
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("La longitud debe ser un número entero.");
	                }
	            } else {
	                System.out.println("Debe indicar la longitud después de 'lista'");
	            }
	        } else if (partesCmd[0].equals("borrar")) {
	            if (partesCmd.length > 1) {
	                palabras.borPalabras(partesCmd[1]);
	            } else {
	                palabras.borPalabras();
	            }
	            System.out.println("Palabras borradas.");
	        } else if (partesCmd[0].equals("fin")) {
	            palabras.borPalabras();
	            System.out.println("Programa finalizado.");
	        } else {
	            System.out.println("Comando no reconocido.");
	        }
	    }
	}
}
