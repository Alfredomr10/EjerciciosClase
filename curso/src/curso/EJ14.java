package curso;

interface EJ14 {
void getarea();
default void getsides() {
	System.out.println("I can get sides of a poligonera");
}
}
abstract class JEJE implements EJ14{
		public void getArea() {
			int length=6;
			int breadth=5;
			int area = length * breadth;
			System.out.println(area);
		}

		@Override
		public void getsides() {
			System.out.println("yo tengo 4 laos");
			
		}

}
	


