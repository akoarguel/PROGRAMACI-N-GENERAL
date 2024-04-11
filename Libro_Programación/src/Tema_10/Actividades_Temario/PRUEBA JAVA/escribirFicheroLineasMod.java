import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class escribirFicheroLineasMod {
    public static void main(String[] args) {
        try {
            File fichero = new File("C:\\Users\\manel\\Documents\\FICHEROS\\EscribirFichero3.txt");
            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 0; i < 11; i++) {
                pw.println("ESTO ES LA LÍNEA NÚMERO: " + i);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
