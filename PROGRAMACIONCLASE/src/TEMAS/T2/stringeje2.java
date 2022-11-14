import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringeje2 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un texto: ");
        String cadena = in.readLine();
        String invertida ="";
        for (int i=0; i<cadena.length(); i++)
            invertida = cadena.charAt(i) + invertida;
        System.out.println(invertida);
        
}
}
