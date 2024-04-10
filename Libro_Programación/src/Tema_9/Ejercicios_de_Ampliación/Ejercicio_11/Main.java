package Tema_9.Ejercicios_de_Ampliación.Ejercicio_11;

public class Main {
    public static void main(String[] args) {
        InstrumentoViento iv = new InstrumentoViento("TUKI", Tipo.VIENTO, "Metal");
        InstrumentoPercusion ip = new InstrumentoPercusion("WIKI", Tipo.PERCUSION, "BONGÓS");
        Perro pr = new Perro("KUKI", "TERRIER");
        Gato gt = new Gato("LEON", "NARANJA");

        System.out.println(iv.sonidoProducido());
        System.out.println(ip.sonidoProducido());

        System.out.println(pr.sonidoProducido());
        System.out.println(gt.sonidoProducido());
    }
}
