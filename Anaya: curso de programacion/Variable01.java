package anyaprogramacion;

public class Variable01 {

	public static void main(String[] args) {
	
		int numCliente = Integer.valueOf(args[0]);
		int numEmpleado = Integer.valueOf(args[1]);
		int numSillas = Integer.valueOf(args[2]);
		int numMesas = Integer.valueOf(args[3]);
		int numContracos = Integer.valueOf(args[4]);
		int numReclamaciones = Integer.valueOf(args[5]);

		int numPersonas = suma(numCliente, numEmpleado);
		int numMuebles = suma(numSillas, numMesas);
		int numExpedientes = suma(numContracos, numReclamaciones);

		System.out.println("Tenemos " + numPersonas + " personas, " + numMuebles + " muebles y " + numExpedientes
				+ " expedientes.");
	}

	private static int suma(int A, int B) {	
		return A + B;
	}

}
