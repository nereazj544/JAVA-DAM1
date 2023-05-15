package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	double[] num = new double[3];
	for (int i=0; i < 3; i++)
		num[i] = S.nextDouble();
	Arrays.sort(num);
	for(int i = num.length - 1; i>= 0;i--)
		System.out.println(num[i]);
}
}
