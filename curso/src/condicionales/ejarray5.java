package condicionales;

import java.util.Scanner;

public class ejarray5 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		int cer = 0;
		int[] numero = new int[10];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("introduce valor " + (i + 1));
			numero[i] = a.nextInt();
		}
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == 0) {
				cer++;
			} else if (numero[i] < 0) {
				neg++;
			} else {
				pos++;
			}
		}
		System.out.println("hay " + pos + " numeros pos");
		System.out.println("hay " + neg + " numeros neg");
		System.out.println("hay " + cer + " numeros cer");
	}
}
