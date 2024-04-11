package FicheroPersona;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FicheroPersona {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream oos;
        try {
            File FicheroPersonas = new File("C:\\Users\\manel\\Documents\\FICHEROS\\FichPersonas.dat");
            oos = new ObjectOutputStream(new FileOutputStream(FicheroPersonas));
            
            Persona persona;

            String[] nombres = {"MANEL", "ZETA", "HADA", "CASTRILLO", "POZO"};
            int[] edades = {20, 19, 22, 21, 21};

            System.out.println("Gabo los datos de tipo persona. ");

            for (int i = 0; i < edades.length; i++) {
                persona = new Persona(nombres[i], edades[i]);
                oos.writeObject(persona);
                System.out.println("Persona " + (i+1) + " grabada con éxito. ");
            }
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
}
