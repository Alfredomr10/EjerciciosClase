package curso;
import  java.io.File;
import java.util.Arrays;
public class readDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File directorio= new File("C:/");
String[] lista = directorio.list();
Arrays.sort(lista);

for (int i =0;i<lista.length; i++) {
	System.out.println(lista[i]);
}
	}

}
