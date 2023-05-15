package repaso;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tiendajuego {
public static void main(String[] args) {
	Map<String, Float> juegos = new HashMap<>();
	juegos.put("OutFall 4", 39.99f);
	juegos.put("CS:OG", 15.99f);
	juegos.put("Honored 2", 39.99f);
	juegos.put("RoverWatch", 39.99f);
	juegos.put("RoverWatch Origins Edition", 39.99f);
	
	Scanner s = new Scanner(System.in);
	float sa = Float.parseFloat(s.nextLine());
	float sO = sa;
	String L = s.nextLine();
	while (!L.equals("Game Time") && sa > 0 ) {
		Float precio = juegos.get(L);
		if(precio == null)
			System.err.print("No encontrado");
		else if (precio > sa)
			System.out.println("Too Expensive");
		else {
			System.out.println("Bought" + L);
			sa -= precio;
		}
	}
	if (sa == 0)
		System.out.println("Dinero insuficiente. Intentelo cuando consiga más dinero");
	else
		System.out.println("Total gastado: " + sa + " .  Restante" + sO);
}
}
