package condicionales;

import java.util.Scanner;

public class ejarray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		double total = 0.0;
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println("introduce numero");
			a[i] = s.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			total += a[i];
		}
		System.out.println("media: " + total / a.length);
	}
}
