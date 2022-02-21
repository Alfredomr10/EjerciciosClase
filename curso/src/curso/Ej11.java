package curso;

	public class Ej11 implements Ej11Series {
int iniciar;
int valor;

Ej11(){
	iniciar =0;
	valor =0;
	
}
		public int getSiguiente() {
			valor +=2;
			return valor;
			
		}
		public void reiniciar() {
			valor = iniciar;
			
		}
		public void setComenzar(int x) {
			iniciar=x;
			valor=x;
		}
	
public static void main(String[]args) {
	Ej11 obj1= new Ej11();
	for (int i=0;i<5;i++)
		System.out.println("siguiente valor es : "+obj1.getSiguiente());
	System.out.println("Reiniciando");
	obj1.reiniciar();
	
	for (int i=0;i<5;i++)
		System.out.println("siguiente valor es : "+obj1.getSiguiente());
System.out.println("iniciando en 100");
obj1.setComenzar(100);

for(int i=0; i<5; i++)
	System.out.println("Siguiente valor es: "+obj1.getSiguiente());
}

}
