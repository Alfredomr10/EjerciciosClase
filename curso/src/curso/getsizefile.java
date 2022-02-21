package curso;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class getsizefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String filename="jaja.txt";
printFileSizeNIO(filename);
	}
	public static void printFileSizeNIO(String filename) {
		Path path =Paths.get(filename);
		try {
			double bytes = Files.size(path);
			System.out.println(String.format("%f bytes",bytes));
			System.out.println(String.format("%f kilobytes", bytes/1024));

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
