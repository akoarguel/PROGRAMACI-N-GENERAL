import java.io.File;
import java.io.IOException;

public class ejemplo2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\manel\\Documents\\FICHEROS");
        File f1 = new File(dir, "Fichero1.txt");
        File f2 = new File(dir, "Fichero2.txt");

        dir.mkdir();

        try {
            if (f1.createNewFile()) {
                System.out.println("ARCHIVO 1 CREADO CORRECTAMENTE.");
            } else {
                System.out.println("NO SE HA CREADO CORRECTAMENTE EL ARCHIVO");
            } 
            if (f2.createNewFile()) {
                System.out.println("ARCHIVO 2 CREADO CORRETAMENTE. ");
            } else {
                System.out.println("NO SE HA CREADO CORRECTAMENTE");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String[] archivos = dir.list();

        System.out.printf("Hay un total de %d %n", archivos.length);

        for (int i = 0; i < archivos.length; i++) {
            File f3 = new File(dir, archivos[i]);
            System.out.printf("\nNOMBRE: %s,     ES ARCHIVO?: %b     ES DIRECTORIO?: %b", f3.getName(), f3.isFile(), f3.isDirectory());
        }
        
    }


    
}