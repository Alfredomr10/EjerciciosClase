package curso;

public class ej15 {

	private String nombre;
	private String clases;
	private String grado;
	private String grupo;
	
	public String getnombre() {
		return nombre;
	}
	
	public String getclases() {
		return clases;
	}
	public String getgrado() {
		return grado;
	}
	public String getgrupo() {
		return grupo;
	}
	public void setnombre(String nombre) {
		this.nombre= nombre;
	}
	public void setclases(String clases) {
		this.clases= clases;
	}
	public void setgrado(String grado) {
		this.grado= grado;
	}
	public void setgrupo(String grupo) {
		this.grupo= grupo;
	}
	protected void ir_a_clase() {
		System.out.println("estoy llendo a clase");
	}
		protected void estudiar() {
			System.out.println("estoy estudiando");
		
	}
	
}
