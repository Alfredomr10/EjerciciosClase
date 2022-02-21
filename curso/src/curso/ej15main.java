package curso;

public class ej15main {
	public static void main(String[] args) {

		ej17 pepe = new ej17();
pepe.setnombre("pepe");
	pepe.setclases("MATEMATICAS");
	pepe.setgrado("2");
	pepe.setgrupo("Grupo a");
	
	pepe.ir_a_clase();
	pepe.matricularse();
	
	System.out.println(pepe.getnombre());
	
	ej16 luis = new ej16("Luis","Fisica ,Ecologia","3","B");
	luis.ir_a_clase();
	luis.estudiar();
	luis.matricularse();
	
	System.out.println(luis.getnombre());
	System.out.println(luis.getgrado());
	System.out.println(luis.getgrupo());
			
	
	}
}
