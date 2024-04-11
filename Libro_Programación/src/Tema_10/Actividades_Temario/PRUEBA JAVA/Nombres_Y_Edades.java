import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Nombres_Y_Edades {
    public static void main(String[] args) {
        try {
            File fichero = new File("C:\\Users\\manel\\Documents\\FICHEROS\\NombresEdades.dat");
            String[] nombres = {"MANEL", "ZETA", "HADA", "CASTRILLO", "POZO"};
            int[] edades = {20, 19, 22, 21, 21};

            DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(fichero));

            for (int i = 0; i < edades.length; i++) {
                dataOS.writeUTF(nombres[i]);
                dataOS.writeInt(edades[i]);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
