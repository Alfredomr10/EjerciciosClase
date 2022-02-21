package curso;

public class ej16 extends ej15 {

	public ej16 (String nombre, String clases, String grado,String grupo) {
		super.setnombre(nombre);
		super.setclases(clases);
		super.setgrado(grado);
		super.setgrupo(grupo);
	}
	protected void matricularse() {
		System.out.println("me estoy matriculando");

	}
}
