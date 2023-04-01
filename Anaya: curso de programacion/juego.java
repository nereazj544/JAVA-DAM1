package anyaprogramacion;

import java.util.Scanner;

public class juego {
	private static final String PD = "P";
	private static final String PL = "L";
	private static final String TJ = "T";
	private static final String ESC = "S";

	private static final String[] JUEGO = {PD, PL, TJ};

	private static final int EMPATE = 0;
	private static final int GANAS = 1;
	private static final int PIERDES = 2;

	private static final int ERROR_NO_ENCONTRADA = -1;

	// Mensajes al usuario
	private static final String BIENVENIDA = 
		"¡Bienvenido al juego Piedra-papel-tijeras!";
	private static final String OPCIONES = 
		PD + " (piedra), " + PL + " (papel), " 
		+ TJ + " (tijeras) o " + ESC + " (salir)";
	private static final String PJ = 
		"¿Cuál es tu jugada? " + OPCIONES;
	private static final String PNewJ = 
		"¿Cuál es tu nueva jugada? " + OPCIONES;
	private static final String FIN = "Fin de la partida";

	private static final String MSJ_ERROR_NO_ENCONTRADA = 
		"No entiendo tu jugada";

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

		// Instrucciones
		System.out.println(BIENVENIDA);
		System.out.println(" ");
		System.out.println(PJ);

		while(true) { // iteramos para siempre
			// Jugada del ordenador
			int elPC = (int)(Math.random() * JUEGO.length);

			// Jugada del usuario
			String sElUser = s.next();
			if (sElUser.equalsIgnoreCase(ESC)) {
				break; 
			}

						int elUser = convertir(sElUser);
			if (elUser == ERROR_NO_ENCONTRADA) {
				System.err.println(MSJ_ERROR_NO_ENCONTRADA);
				continue; 
			}

			// ganador
			int resultado = usuarioGana(elPC, elUser);

			// Mostar el resultado de la jugada
			switch (resultado) {
				case GANAS:
					System.out.println("¡Enhorabuena! Tu " 
						+ JUEGO[elUser] + " gana a " 
						+ JUEGO[elPC]);
					break;
				case PIERDES:
					System.out.println("¡Lo siento! Tu " 
						+ JUEGO[elUser] + " pierde ante " 
						+ JUEGO[elPC]);
					break;
				case EMPATE:
					System.out.println("¡Empate a " + JUEGO[elPC] + "!");
					break;
			}
			System.out.println("¿Cuál es tu nueva jugada? P (piedra), L (papel), T (tijeras) o S (salir)");
		}
		System.out.println(FIN);
		s.close();
	}

	private static int convertir(String sEleccionUsuario) {
		for (int i = 0; i < JUEGO.length; i++) {
			if (JUEGO[i].equalsIgnoreCase(sEleccionUsuario)) {
			return i;
			}
		}
		return ERROR_NO_ENCONTRADA; 
	}

	private static int usuarioGana(int eleccionPC, int eleccionUsuario) {
		int res = eleccionUsuario - eleccionPC;
		if (res < 0) {
			res += JUEGO.length; 
		}
		return res;
	}
}