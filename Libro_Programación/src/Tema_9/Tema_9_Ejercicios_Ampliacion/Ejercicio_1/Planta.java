package Tema_9.Tema_9_Ejercicios_Ampliacion.Ejercicio_1;

public class Planta extends SerVivo{
    private String tipo;
    private String altura;
    private String tipoSuelo;
    private String floracionMeses;

    public Planta(String nombreCientifico, int edad, String habitat, String tipo, String altura, String tipoSuelo,
            String floracionMeses) {
        super(nombreCientifico, edad, habitat);
        this.tipo = tipo;
        this.altura = altura;
        this.tipoSuelo = tipoSuelo;
        this.floracionMeses = floracionMeses;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public String getFloracionMeses() {
        return floracionMeses;
    }

    public void setFloracionMeses(String floracionMeses) {
        this.floracionMeses = floracionMeses;
    }

    @Override
    public String toString() {
        return super.toString() + "TIPO: " + tipo +
                 "ALTURA: " + altura + "TIPO DE SUELO: " + tipoSuelo + 
                 "FORACION EN MESES: " + floracionMeses;
    }
}
