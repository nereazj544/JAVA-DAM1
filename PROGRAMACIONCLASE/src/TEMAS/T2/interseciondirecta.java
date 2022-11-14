import java.util.Arrays;

public class interseciondirecta{
    public static void main(String[] args) {
        int [] numeros = new int [10];
        for (int i=0; i<numeros.length; i++)
            numeros[i] = (int) (Math.random()*20);
            System.out.println(Arrays.toString(numeros));
            intersecionDirecta(numeros);
            System.out.println(Arrays.toString(numeros));
    }
    static void intersecionDirecta (int [] v){
        for (int i=1; i<v.length; i++){
            int j = 0;
            while(j < i && v[j] < v[i])
                j++;
            if (j < i){
                int aux = v[i];
                for (int k=i-1; k>=j; k--)
                    v[k+1] =v[k];
                v[j] = aux;
            }
        }

    }

    static int[] intercambioDirecto(int [] arreglo){
        int inter = 0, compa = 0;
		
		int aux2;
		for(int i = 1; i<arreglo.length; i++){
			for(int j= arreglo.length-1; j>=i; j-- ){
				compa++;
				if (arreglo[j-1]>arreglo[j]){
					inter++;
					aux2 = arreglo[j-1];
					arreglo[j-1] = arreglo[j];
					arreglo[j] = aux2;			
				}
			}
		}	
		System.out.println("Numero de intercambios:"+inter);
		System.out.println("Numero de comparaciones:"+compa);
		return arreglo;

    }
    
    static void seleccionDirecta (int [] v){

    }
}