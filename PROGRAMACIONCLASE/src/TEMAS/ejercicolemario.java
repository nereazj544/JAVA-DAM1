package segundaevaluacionjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ejercicolemario {
	public static void main(String[] args) throws IOException {
		List<String> lemario;
		
		lemario = Files.readAllLines(Paths.get("recursos", "lemario-general-del-espanol.txt"));
		
		//EJERCICIO 1
		lemario.stream().filter(n-> n.matches("^[a-m].$")).forEach(System.out::println);
		
		//EJERCICO 2 (sin streams)
		Map<String, List<String>> mapa = new TreeMap <>();
		lemario.forEach(s ->{
			if(s.length()>3) {
				String key = s.substring(0,3);
				List<String> lista = mapa.computeIfAbsent(key, k -> new LinkedList<String>());
				lista.add(s);
						
			}
		});
		
		//mapa.forEach((k, v) -> System.out.println(k + ": " + v));
		mapa.forEach((k, v) -> System.out.println(k + "(" + k.length() + ")" + ": " + v));
		
		//EJERCICO 2 (conn streams) groupingBy
		Map<String, List<String>> mapa2;
		mapa2 = lemario.stream().filter(s -> s.length() > 3).collect(Collectors.groupingBy(s -> s.substring(0,3)));
		mapa2.forEach((k, v) -> System.out.println(k+ " (" + k.length() + ") " + ": " + v));
	
	//EJECIRCIO 3 PALINDROMOS
		
		List<String> lista1 = lemario.stream().filter(ejercicolemario::isPalindrome).toList();
		
	//EJERCICO 4 NUMERO DE PALABRAS (CONTAR) DE LA "A" A LA "Z"
		
	
	
	
	}
	static boolean isPalindrome(String s) {
		return true;
	}
	
}
