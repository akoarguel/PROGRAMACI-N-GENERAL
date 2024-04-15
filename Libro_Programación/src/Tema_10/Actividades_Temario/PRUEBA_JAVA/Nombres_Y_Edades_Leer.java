package Tema_10.Actividades_Temario.PRUEBA_JAVA;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Nombres_Y_Edades_Leer {
    public static void main(String[] args) throws IOException {
        try {
            File f1 = new File("C:\\Users\\manel\\Documents\\FICHEROS\\NombresEdades.dat");

            DataInputStream dis = new DataInputStream(new FileInputStream(f1));

            String nombres;
            int edades;

            try {
                while (true) {
                    nombres = dis.readUTF();
                    edades = dis.readInt();
                    System.out.println("Nombre : " + nombres + "    Edad: " + edades);
                }
            } catch (Exception e) {
                System.out.println("FIN");
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
