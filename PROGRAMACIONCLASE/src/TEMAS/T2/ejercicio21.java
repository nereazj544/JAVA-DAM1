import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio21 {
    public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	  
    System.out.print("n");
    int n = Integer.parseInt(br.readLine());

    for (int i=0; i<n; i++) {
	int asteriscos = n-i;
	String lol="*";
	for (int j=0; j<asteriscos; j++){
		lol+="*";
	}
    System.out.println(lol); 
    }

    }
}
