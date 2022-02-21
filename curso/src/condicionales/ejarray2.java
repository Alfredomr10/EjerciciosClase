package condicionales;

import java.util.Scanner;

public class ejarray2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		int i;
		double total = 0.0;
		for (i = 0; i < a.length; i++) {
			System.out.println("introduce numero " + i);
			a[i] = s.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				total += a[i];
			}
		}
		System.out.println("media de los numeros pares " + total / (a.length / 2));
	}

}