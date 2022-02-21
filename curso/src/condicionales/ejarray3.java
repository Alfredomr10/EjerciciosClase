package condicionales;

import java.util.Scanner;

public class ejarray3 {
	public static void main(String[] args) {
		String[] alumnos = { "a", "b", "c", "d", "e" };
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		double total = 0.0;
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println("introduce las notas: " + alumnos[i]);
			a[i] = s.nextInt();
		}

		for (i = 0; i < a.length; i++) {
			total += a[i];
		}
		double media = total / a.length;
		System.out.println("media de todos los alumnos " + media);

		for (i = 0; i < a.length; i++) {
			if (a[i] > media) {
				System.out.println("alumno por encima de la media " + (alumnos[i]) + " nota final: " + a[i]);
			}
		}

	}
}
