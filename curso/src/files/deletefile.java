package files;

import java.io.File;

public class deletefile {
	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\Invitado21-22-19\\Desktop\\proyectosjava\\curso\\src\\files\\a.txt.txt");

		if (myObj.delete()) {
			System.out.println("deleted the file:" + myObj.getName());
		} else {
			System.out.println("fallo");
		}
		
	}
}
