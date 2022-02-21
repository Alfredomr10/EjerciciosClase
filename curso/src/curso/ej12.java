package curso;

public class ej12 implements ej12constante {
public static void main(String[] args) {
	int numeros[]=new int[10];
	
	for(int i=MIN; i<11; i++) {
		if (i>=MAX) 
			System.out.println(MSJERROR);
		else {
			 numeros[i]=i;
			System.out.println(numeros[i]);
		}
	}
}
}
