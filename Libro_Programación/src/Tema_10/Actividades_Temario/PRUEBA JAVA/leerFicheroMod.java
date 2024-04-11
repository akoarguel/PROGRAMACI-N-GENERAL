import java.io.File;
import java.io.FileReader;

public class leerFicheroMod {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\manel\\Documents\\FICHEROS\\LeerFichero1.txt");

        try (FileReader fr = new FileReader(f)){
            
            int i;
            char b[] = new char[30];

            while ((i = fr.read(b)) != 0) {
                System.out.print(b);
            }

        } catch (Exception e) {
        }

    }
}
