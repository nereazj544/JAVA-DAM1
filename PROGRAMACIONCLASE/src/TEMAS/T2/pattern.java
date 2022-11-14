import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        String s1="112 abc 433 98.3";
        Scanner s = new Scanner(System.in);
        System.out.println(s.delimiter());
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.nextDouble());

        /*    String s1 = "ab123; *=325----;:";
    String s2 = "123";
    Pattern p = Pattern.compile("[0-9]+");
    Matcher m1=p.matcher(s1);
    Matcher m2 = p.matcher(s2);

    System.out.println("cadena 1 parte1: " +m1.find());
    System.out.println(m1.group() + " - " + m1.start() + " - " + m1.end());
        System.out.println("cadena 1 parte2: " + m1.find());
        System.out.println(m1.group() + " - " + m1.start() + " - " + m1.end());

    System.out.println("cadena 2: " + m2.find());
    System.out.println(m2.group() + " - " + m2.start() + " - " + m2.end());    */
    
    
    /*  Pattern p = Pattern.compile("[0-9]");
    System.out.println(m2.matches());
    System.out.println(m1.matches());
    Pattern n =  Pattern.compile("\\[");*/
    }
}