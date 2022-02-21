package curso;

import java.io.File;

public class Renamefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File oldfile = new File("C:\\jeje.txt");
File newfile = new File("jaja.txt");

if (oldfile.renameTo(newfile)) {
	System.out.println("archivo renombrado");
}else {
	System.out.println("error");
}
	}

}
