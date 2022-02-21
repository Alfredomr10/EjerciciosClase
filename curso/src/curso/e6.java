package curso;

public class e6 {
	public static void main(String[] args) {

int[] n = {1,2,3};
System.out.println(n[2]);
System.out.println("======================================");

	for(int i=0; i<=2; i++) {
		System.out.println(n[i]);
	
		if (n[i]<2) {
			System.out.println("numero menor");
		}else {
			System.out.println("numero mayor");
		}
	}
	System.out.println("======================================");
	System.out.println("tamaño Array:  "+n.length);

	}
}
