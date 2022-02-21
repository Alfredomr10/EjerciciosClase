package condicionales;

public class ej4 {

	public static void main(String[] args) {
		int c = 55;
		System.out.println(c + (c >= 0 ? " positivo " : " negativo "));
		System.out.println(c + (c % 2 == 0 ? " par " : " impar "));
		System.out.println(c + (c % 5 == 0 ? " múltiplo de 5 " : " no es múltiplo de 5 "));
		System.out.println(c + (c % 10 == 0 ? " múltiplo de 10 " : " no es múltiplo de 10 "));
		System.out.println(c + (c > 100 ? " mayor que 100 " : " menor que 100 "));
	}
}
