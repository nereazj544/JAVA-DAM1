package pruebas;

import java.util.Calendar;
import java.util.Random;

public class CaracteristiacasRandom {
	 public static void main(String[] args) {
	        Random r = new Random();

//	        MES Y DIA RANDOM
	        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
	                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	        String mes = meses[r.nextInt(meses.length)];
	        Calendar c = Calendar.getInstance();
	        c.set(Calendar.MONTH, getIndexMes(mes));
	        int diasMes = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	        int dia = r.nextInt(diasMes) + 1;
	        System.out.println("La fecha aleatoria es: " + mes + " " + dia);
	        
	        
//	        GUSTOS	        
	        String [] gustos = {"La musica alta", "las fiestas", "los amigos", "las luchas", "los eventos deportivos", "estar al aire libre", "las películas de acción", "dinero", "Ser admirado por otras personas", "Aconsejar", "los niños", "leer", "escribir", "programar", "cantar", "la comida picante"};
//	        MOSTRAR TRES GUSTOS
	        for (int i = 0; i < 3; i++) {
	            String gusto = gustos[r.nextInt(gustos.length)];
	            System.out.println("Gusto " + (i + 1) + ": " + gusto);
	        }
	        	        
//	        DISGUTOS
	        String [] disgustos = {"Los eventos deportivos", "los sonidos fuertes", "las fiestas", "los videojuegos", "la comida picante", "La musica alta", "las fiestas", "los amigos", "las luchas", "las peliculas de terror", "los niños", "programar"};
//	        MOSTRAR TRES disGUSTOS
	        for (int i = 0; i < 3; i++) {
	            String disgusto = disgustos[r.nextInt(disgustos.length)];
	            System.out.println("Disgusto " + (i + 1) + ": " + disgusto);
	        }
	        
//	        Color de pelo
	        
	        String [] colorpelos = {"castaño", "moreno", "pelirrojo", "verde", "azul", "rubio"};
	        String colorpelo = colorpelos[r.nextInt(colorpelos.length)];
	        System.out.println("Color del pelo: " + colorpelo );
	        
	        
//	        Color de ojos
	        String [] colorojos = {"marrones", "verdes", "azules", "marrones-claros"};
	        String colorojo = colorojos [r.nextInt(colorojos.length)];
	        System.out.println("Color de los ojos: " + colorojo);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
//	        SIN REPETIR
//	        String [] gustos = {"La musica alta", "las fiestas", "los amigos", "las luchas", "los eventos deportivos", "estar al aire libre", "las películas de acción", "dinero"};
//	        List<String> gustosSeleccionados = new ArrayList<String>();
//
//	        while (gustosSeleccionados.size() < 3) {
//	            String gusto = gustos[r.nextInt(gustos.length)];
//	            if (!gustosSeleccionados.contains(gusto)) {
//	                gustosSeleccionados.add(gusto);
//	            }
//	        }
//
//	        for (int i = 0; i < gustosSeleccionados.size(); i++) {
//	            System.out.println("Gusto " + (i + 1) + ": " + gustosSeleccionados.get(i));
//	        }


	    }
	        
//	        MES RANDOM
	    private static int getIndexMes(String mes) {
	        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	        for (int i = 0; i < meses.length; i++) {
	            if (meses[i].equals(mes)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}