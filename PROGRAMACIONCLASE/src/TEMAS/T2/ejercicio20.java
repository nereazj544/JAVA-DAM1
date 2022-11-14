import java.util.NoSuchElementException;
import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean fin = false;
		while (!fin) {
			System.out.print("> ");
			fin = ejecutarComando(in.nextLine());
		}
		in.close();
	}
	
	static boolean ejecutarComando(String comando) {
		Scanner scanner = new Scanner(comando);
		try {
			String cmd = scanner.next("matriz|intercambia|fin");
			switch (cmd) {
			case "matriz":
				matriz(scanner);
				break;
			case "intercambia":
				intercambia(scanner);
				break;
			default: /* fin */
				return true;
			}
		} catch (NoSuchElementException e) {
			System.out.println("comando incorrecto");
		}
		scanner.close();
		return false;
	}
	
	static void matriz(Scanner scanner) {
		int filas = scanner.nextLine();
        scanner.next("x");
        int colummnas = scanner.nextInt();
        scanner.next(":");

        

	}
	
	static void intercambia(Scanner scanner) {
		
	}

}