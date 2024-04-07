package Tema_7_Ejercicios_Ampliacion.Ejercicio_6;

public class Rectangulo {
    private int ancho;
    private int alto;
    private int posX;
    private int posY;
    private char caracter;

    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
        this.posX = 0;
        this.posY = 0;
        this.caracter = 'X';
    }

    public Rectangulo(int ancho, int alto, int posX, int posY, char caracter) {
        this.ancho = ancho;
        this.alto = alto;
        this.posX = posX;
        this.posY = posY;
        this.caracter = caracter;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public void dibuja(int anchoPantalla, int altoPantalla) {
        // Verificar si el rectángulo cabe en la pantalla
        if (!esValido(anchoPantalla, altoPantalla)) {
            System.out.println("El rectángulo no cabe en la pantalla.");
            return;
        }
    
        // Crear una matriz de caracteres para representar la pantalla
        char[][] pantalla = new char[altoPantalla][anchoPantalla];
    
        // Inicializar la pantalla con caracteres #
        for (int i = 0; i < altoPantalla; i++) {
            for (int j = 0; j < anchoPantalla; j++) {
                pantalla[i][j] = '#';
            }
        }
    
        // Dibujar el rectángulo en la pantalla
        for (int i = posY; i < posY + alto; i++) {
            for (int j = posX; j < posX + ancho; j++) {
                pantalla[i][j] = caracter;
            }
        }
    
        // Imprimir la pantalla con el rectángulo dibujado
        for (int i = 0; i < altoPantalla; i++) {
            for (int j = 0; j < anchoPantalla; j++) {
                System.out.print(pantalla[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    public boolean esValido(int anchoPantalla, int altoPantalla){
        if (anchoPantalla <= 15 && altoPantalla <= 15) {
            return true;
        }
        return false;
    }

}
