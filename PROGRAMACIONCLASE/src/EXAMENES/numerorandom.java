public class numerorandom{
    /*Ejercico 1 del examen: 
 *     Definir un método llamado mostrar que reciba en un parámetro
 *     formal un array de números enteros y muestre su contenido en
 *     la pantalla usando una sola sentencia no repetitiva.
 *     A continuación, retornará el número almacenado en una posición
 *     elegida de forma aleatoria (no usar la clase Random).
 *     En el método main invocar al anterior y mostrar en pantalla el
 *     valor retornado.
    */
    public static void main(String[] args) {
    int [] num = {1, 2, 3, 4, 5};
    System.out.println("numeros a elegir " + mostrar(num));
    }
    static int mostrar(int [] num){
        System.out.println(Array.toString(num));
    }
}