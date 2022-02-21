package curso;
import java.util.Scanner;
public class ej18 {

	public static void main(String[] args) {
		char opcion;
		int i, j;
		int[][]numeros=new int[3][5];
		Scanner s = new Scanner(System.in);
		System.out.println();
		do {
			System.out.println("\n>>>MENU DE OPCIONES<<<");
			System.out.println("\n1 Mostrar numeros de la matriz");
			System.out.println("\n2 asignar numeros aleatorios");
			System.out.println("\n3 iniciar la matriz a 0");
			System.out.println("\n4 salir");
		do {
			System.out.printf("\n Introduzca opcion  (1-4):");
			opcion =s.next().charAt(0);
		}while(opcion < '1' || opcion >'4');
		
		System.out.println("\n");
		
		switch(opcion){
			case '1':
				break;
			case '2':
				break;
			case '3':
				break;
			case'4':
				break;
				
					}
	
		}while(opcion !='4');
	}
}
