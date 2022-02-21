package curso;

import java.util.Scanner;

public class e7 {
	public static void main(String[] args) {
double[] numeros = new double [5];
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<numeros.length; i++) {
		System.out.printf("Introduce numero: ",i+1);
		numeros[i] = sc.nextDouble();
	}
	double suma = 0;
	for(int i=0; i<numeros.length; i++) {
		suma += numeros[i];
		System.out.println(numeros[i]);
	}
	System.out.println("la suma es: "+suma);
	System.out.println("la media es: "+suma/numeros.length);
	}
}
