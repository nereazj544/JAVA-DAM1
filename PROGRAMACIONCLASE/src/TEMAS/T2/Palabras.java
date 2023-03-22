package eje;

import java.util.*;

public class Palabras {
	// Para que funcione el programa se debe de poner: " Comando: "
	private Set<String> palabras;
	private Map<Integer, List<String>> palabrasLong;

	public Palabras() {
		palabras = new HashSet<>();
		palabrasLong = new TreeMap<>();
	}

	public Palabras(String cadena) {
		palabras = new HashSet<>();
		palabrasLong = new TreeMap<>();
		agrPalabras(cadena);
	}

	public void agrPalabra(String palabra) {
		if (!palabras.contains(palabra)) {
			palabras.add(palabra);
			int longi = palabra.length();
			if (!palabrasLong.containsKey(longi)) {
				palabrasLong.put(longi, new ArrayList<>());
			}
			palabrasLong.get(longi).add(palabra);
		}
	}

	public void agrPalabras(String cadena) {
		String[] palabrasSep = cadena.split("\\s+");
		for (String palabra : palabrasSep) {
			agrPalabra(palabra);
		}
	}

	public boolean contPalabra(String palabra) {
		return palabras.contains(palabra);
	}

	public void borPalabras() {
		palabras.clear();
		palabrasLong.clear();
	}

	public void borPalabras(String cadena) {
		borPalabras();
		agrPalabras(cadena);
	}

	public List<String> obtenerPalabrasPorLongitud(int longitud) {
		return palabrasLong.getOrDefault(longitud, new ArrayList<>());
	}
}
