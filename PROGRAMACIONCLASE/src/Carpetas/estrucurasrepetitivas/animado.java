package tema2.ejercicios.estrucurasrepetitivas;

public class animado {
    public static void main(String[] args) {
		int ancho = Integer.valueOf(args[0]);
		int alto = Integer.valueOf(args[1]);
		String s = "";
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				s += "X";
			}
			s += "\n";
		}
		System.out.println(s);
	}
}
