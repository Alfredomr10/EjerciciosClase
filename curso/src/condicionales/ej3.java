package condicionales;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("introduce numero entero");
		a = s.nextInt();
		String resultado = (a % 2 == 0) ? "par" : "impar";
		System.out.println(resultado);
	}
}