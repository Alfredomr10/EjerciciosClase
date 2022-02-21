package curso;

import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("escribe un dia de la semana");
		String dia = sc.next();

		System.out.println("dia introducido: " + dia);
		e4a diaS = e4a.valueOf(dia.toUpperCase());

		switch(diaS) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("el dia "+diaS.name().toLowerCase()+"es laborable");

		}
	}
}
