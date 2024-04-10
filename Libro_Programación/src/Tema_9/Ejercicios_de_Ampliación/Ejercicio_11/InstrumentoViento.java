package Tema_9.Ejercicios_de_Ampliación.Ejercicio_11;

public class InstrumentoViento extends InstrumentoMusical implements Sonidos{
    private String tipoViento;

    public InstrumentoViento(String nombre, Tipo tipo, String tipoViento) {
        super(nombre, tipo);
        this.tipoViento = tipoViento;
    }

    public String getTipoViento() {
        return tipoViento;
    }

    public void setTipoViento(String tipoViento) {
        this.tipoViento = tipoViento;
    }

    @Override
    public String toString() {
        return super.toString() + "InstrumentoViento [tipoViento=" + tipoViento + "]";
    }

    @Override
    public String sonidoProducido() {
        return "TUTUTUTU";
    }
    
}
