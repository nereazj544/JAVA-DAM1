package tema2.ejercicios;

public class retratorobot {
    public static void main(String[] args) {
        final String pelo1 = "1. WWWWWWWWW" ;
        final String pelo2 = "2. \\\\\\//////";
        final String pelo3 = "3.|\"\"\"\"\"\"\"|";
        final String pelo4 = "4.||||||||| ";



        System.err.println("Vamos a realizar el siguiente retraro robot debera de elegir entre las siguientes opciones:");
        System.err.println("Elige el tipo de pelo");
        System.err.println("Pelo 1: " + pelo1);
        System.err.println("Pelo 2: " + pelo2);
        System.err.println("Pelo 3: " + pelo3);
        System.err.println("Pelo 4: " + pelo4);
        int pelo = Integer.parseInt(in.readLine());

        switch (pelo) {
            case 1:
                System.out.println(pelo1);
                break;
            case 2:
                System.out.println(pelo2);
                break;
            case 3:
            System.out.println(pelo3);
                break;
            default:
                System.out.println(pelo4);
                break;
        }
        
        

        
    }
}
