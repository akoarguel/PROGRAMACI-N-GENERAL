package Tema_7.Actividad_75;

public class Fecha {
    private int dia;
    private int mes;
    private int año;


    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }



    public int getDia() {
        return dia;
    }



    public void setDia(int dia) {
        this.dia = dia;
    }



    public int getMes() {
        return mes;
    }



    public void setMes(int mes) {
        this.mes = mes;
    }



    public int getAño() {
        return año;
    }



    public void setAño(int año) {
        this.año = año;
    }



    @Override
    public String toString() {
        return + dia + "/" + mes + "/" + año;
    }



    public int compareTo(Fecha otraFecha) {
        if (this.año != otraFecha.año) {
            return Integer.compare(this.año, otraFecha.año);
        } else if (this.mes != otraFecha.mes) {
            return Integer.compare(this.mes, otraFecha.mes);
        } else {
            return Integer.compare(this.dia, otraFecha.dia);
        }
    }

}