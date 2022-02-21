package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class e3 {
public static void main(String[]args) throws ParseException {

	System.out.println("String parsing into date object : /n");
	String strDate1 = "12/01/2020";
	
	SimpleDateFormat strFormat1 = new SimpleDateFormat("dd/MM/yyyy");
	
	java.util.Date dateObj1 = strFormat1.parse(strDate1);
	
	System.out.println(strFormat1);
	
	System.out.println("Date String 1 = "+strDate1+" /t Date Object 1 = "+dateObj1);
	System.out.println("\n\nString parsing int Integer: /n");
	String strVal1 ="50";
	
	int intvalue1 = Integer.parseInt(strVal1);
	
	System.out.println(intvalue1);
}
}
