package Tema_10.Actividades_Temario.PRUEBA_JAVA.Ejercicios_DDR;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "PRODUCTO 1", 10.5, true, 'T'));
        productos.add(new Producto(2, "PRODUCTO 2", 18.5, true, 'T'));
        productos.add(new Producto(3, "PRODUCTO 3", 10.5, false, 'R'));
        productos.add(new Producto(4, "PRODUCTO 4", 50.5, true, 'T'));
        productos.add(new Producto(5, "PRODUCTO 4", 13.5, false, 'Z'));

        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\manel\\Documents\\FICHEROS\\ejemplo_raf.dat", "rw")){         //auto-cerrar   ru = lectura y escritura
            
            for (Producto producto : productos) {
                raf.writeInt(producto.getId());

                StringBuffer sb = new StringBuffer(producto.getNombre());
                sb.setLength(10);

                raf.writeChars(sb.toString());

                raf.writeDouble(producto.getPrecio());
                raf.writeBoolean(producto.equals(producto.isDescuento()));
                raf.writeChar(producto.getTipo());

            }

            // int 4
            // String 2 por cada caracter = 20
            // Double 8
            // boolean 1
            // char 2
            // 4 + 20 + 8 + 1 + 2 = 35 bytes cada registro

            raf.seek(35);
            System.out.println(raf.readInt());
            String nombre = "";
            for (int i = 0; i < 10; i++) {
                nombre += raf.readChar();
            }
            System.out.println(nombre);
            System.out.println(raf.readDouble());
            System.out.println(raf.readBoolean());
            System.out.println(raf.readChar());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException io){
            System.out.println(io.getMessage());
        }

    }
}
