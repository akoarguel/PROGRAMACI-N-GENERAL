import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escribirFicheroLineas {
    public static void main(String[] args) {

        try {
            File fic = new File("C:\\Users\\manel\\Documents\\FICHEROS\\EscribirFichero2.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(fic));

            for (int i = 0; i < 11; i++) {
                bw.write("Linea número: " + i);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
