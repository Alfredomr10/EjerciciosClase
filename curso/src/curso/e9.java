package curso;

public class e9 {
	public static void main(String[] args) {
		String str1 = new String("España,Alemania,Suiza,Chekoslovaquia");
		String delimSpace = ",";

		String[] arr1 = str1.split(delimSpace);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}