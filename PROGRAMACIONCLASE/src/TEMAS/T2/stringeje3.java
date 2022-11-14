import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringeje3 {
        public static void main(String[] args) throws IOException{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe un texto: ");
            String text1 = in.readLine();
            System.out.println("Escribe un texto: ");
            String text2 = in.readLine();
            int c = 0;
            int i = 0;

            do {
                i = text1.indexOf(text2, i);
                if (i >=0)
                    i++;
                    c++;
            } while (i>=0 && i < text1.length());
            System.out.println("el segundo texto esta contenido en el primero " + c +  " veces");
    }
}
