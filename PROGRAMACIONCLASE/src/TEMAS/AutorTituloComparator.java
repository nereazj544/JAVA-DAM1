package segundaevaluacionjava;

import java.util.Comparator;

public class AutorTituloComparator implements Comparator<Publicacion> {
	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		String autor1=o1.getClass() == Revista.class ? "" : ((Libro)o1).getAutores();
		Publicacion o2) {
			String autor2=o2.getClass() == Revista.class ? "" : ((Libro)o2).getAutores();
	}
}
