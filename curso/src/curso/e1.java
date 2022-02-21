package curso;

import java.text.NumberFormat;
import java.util.Locale;

public class e1 {
	public static void main(String[] args) {
		Locale locale = new Locale("en", "UK");
		NumberFormat objNF = NumberFormat.getInstance(locale);
		String cadena = objNF.format(99999.99);
		System.out.println("Inglaterra");
		System.out.println("----------");
		System.out.println(cadena);
	


Locale local = new Locale("es", "ES");
NumberFormat objN = NumberFormat.getInstance(local);
String caden = objN.format(99999.99);
System.out.println("España");
System.out.println("----------");
System.out.println(caden);
}
}