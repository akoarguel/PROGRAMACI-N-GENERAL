package Tema_10.Actividades_Temario.Ejemplo_2;

import java.io.File;
import java.io.IOException;

public class ejemplo {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\manel\\Documents\\FICHEROS");
        File f1 = new File(dir, "Fichero1.txt");
        File f2 = new File(dir, "Fichero2.txt");

        dir.mkdir();

        try {
            if (f1.createNewFile()) {
                System.out.println("Fichero 1 creado correctamente. ");
            } else {
                System.out.println("No se ha podido crear el Fichero 1. ");
            }
            if (f2.createNewFile()) {
                System.out.println("Fichero 2 creado correctamente. ");
            } else {
                System.out.println("No se ha podido crear el Fichero 2. ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        f1.renameTo(new File(dir, "C:\\Users\\manel\\Documents\\FICHEROS\\FicheroRenombrado.txt"));
        try {
            File f3 = new File(dir, "Fichero3.txt");
            f3.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (f2.delete()) {
            System.out.println("El fichero eliminado correctamente. ");
        } else {
            System.out.println("Error al borrar el fichero2. ");
        }
    }
}
