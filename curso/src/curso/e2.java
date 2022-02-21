package curso;

import java.util.Scanner;

public class e2 {
	public static void main(String[]args) {
 Scanner sc =new Scanner (System.in);
 int N, m;
 
	System.out.println("diga N");
	N=sc.nextInt();
			System.out.println("diga m");
			m=sc.nextInt();
			
			N = N / (int)Math.pow(10, m);
			System.out.println("numero modificado "+ N);
	}
}