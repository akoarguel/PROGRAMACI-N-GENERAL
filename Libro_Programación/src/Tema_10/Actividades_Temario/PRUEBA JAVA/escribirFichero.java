import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escribirFichero {
    public static void main(String[] args) throws IOException {
        File fichero = new File("C:\\Users\\manel\\Documents\\FICHEROS\\EscribirFichero.txt");
        
        try {
            FileWriter fw = new FileWriter(fichero, true);

            String cadena = "Esto es una prueba de escritura";
            char[] cad = cadena.toCharArray();
            fw.write("\n");

            for (int i = 0; i < cad.length; i++) {
                fw.write(cad[i]);
                System.out.println("...");
            }

            fw.append("*");
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
