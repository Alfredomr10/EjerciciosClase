package curso;

interface ej13S {
	float rateOfInterest();
}
class Sbi implements ej13S{
	public float rateOfInterest() {
		return 9.15f;
		}
	}
class Pnb implements ej13S{
	public float 
	 rateOfInterest() {
		return 9.7f;
		}
}



public class ej13{
	
public static void main(String[]args) {
	ej13S b = new Sbi();
	System.out.println(b.rateOfInterest());
	
	ej13S b2 = new Pnb();
	System.out.println(b2.rateOfInterest());
	

}
}
