package Tema_9.Ejercicios_de_Ampliación.Ejercicio_11;

public class InstrumentoPercusion extends InstrumentoMusical implements Sonidos{
    private String tipoPercusion;

    public InstrumentoPercusion(String nombre, Tipo tipo, String tipoPercusion) {
        super(nombre, tipo);
        this.tipoPercusion = tipoPercusion;
    }

    public String getTipoViento() {
        return tipoPercusion;
    }

    public void setTipoViento(String tipoViento) {
        this.tipoPercusion = tipoViento;
    }

    @Override
    public String toString() {
        return super.toString() + "InstrumentoViento [tipoViento=" + tipoPercusion + "]";
    }

    @Override
    public String sonidoProducido() {
        return "POM POM";
    }
}
