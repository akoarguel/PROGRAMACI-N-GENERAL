package Tema_10.Actividades_Temario.PRUEBA_JAVA;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class leerFichero1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\manel\\Documents\\FICHEROS\\LeerFichero1.txt");

        try (FileReader fr = new FileReader(f1)){
            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }
}
