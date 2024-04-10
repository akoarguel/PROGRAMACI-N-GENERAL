package Tema_10.Actividades_Temario.Ejemplo_1;

import java.io.File;

public class ejemplosClases {
    public static void main(String[] args) {
        String dir = args[0];
        File f = new File(dir);
        String[] archivos = f.list();
        System.out.printf("Ficheros en directorio actual: %d %n", archivos.length);

        for (int i = 0; i < archivos.length; i++) {
            File f2 = new File(f, archivos[i]);
            System.out.printf("Nombre: %s   Es fichero?: %b     Es directorio?: %b \n", archivos[i], f2.isFile(), f2.isDirectory());
        }
    }
}