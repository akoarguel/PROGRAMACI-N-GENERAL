package Tema_10.Actividades_Temario.PRUEBA_JAVA;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerFicheroBufferedReader {
    public static void main(String[] args) throws IOException {

        try {
            File fichero = new File("C:\\Users\\manel\\Documents\\FICHEROS\\LeerFichero1.txt");
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("NO SE ENCUENTRA EL FICHERO");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR DE E/S");
            e.printStackTrace();
        }

    }
}
