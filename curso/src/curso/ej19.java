package curso;

import java.io.File;
import java.io.IOException;

public class ej19 {
	public static void main(String[] args) {

		try {
			File file=new File("record.txt");
			if (file.createNewFile()) {
				System.out.println("oye q el archivo existe");
			}else {
				System.out.println("oye q no existe jeje");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
