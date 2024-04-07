package Tema_7_Ejercicios_Ampliacion.Ejercicio_2;



public class Fecha {

    public enum DiaSemana{
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;
    }
    
    private DiaSemana dias;
    private int dia;
    private int mes;
    private int año;

    public Fecha(DiaSemana dias, int dia, int mes, int año) {
        this.dias = dias;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public DiaSemana getDias() {
        return dias;
    }

    public void setDias(DiaSemana dias) {
        this.dias = dias;
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

    public void mostrarFecha(){
        System.out.printf(dia + "/" + mes + "/" + año);
    }

    public Fecha diaSiguiente(){
        //array con los días de cada mes, el primero es un slot vacío para que concuerde el mes con el slot del array.
        int [] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //verficar si el año es bisiesto
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            diasPorMes[2] = 29;
        }

        //avanzo un día
        dia++;

        if (dia > diasPorMes[mes]) {
            dia = 1;
            mes++;
        } if (mes > 12) {
            mes = 1;
            año++;
        }

        return new Fecha(dias, dia, mes, año);
        
    }

    public DiaSemana DiaSemana() {
        int q = this.dia;
        int m = this.mes;
        int año = this.año;
        if (m < 3) {
            m += 12;
            año--;
        }
        int K = año % 100;
        int J = año / 100;
    
        int h = (q + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
    
        switch (h) {
            case 0:
                return DiaSemana.Sabado;
            case 1:
                return DiaSemana.Domingo;
            case 2:
                return DiaSemana.Lunes;
            case 3:
                return DiaSemana.Martes;
            case 4:
                return DiaSemana.Miercoles;
            case 5:
                return DiaSemana.Jueves;
            case 6:
                return DiaSemana.Viernes;
            default:
                return null; // Esto nunca debería ocurrir
        }
    }
    
    public boolean menor(Fecha otraFecha) {
        if (this.año < otraFecha.getAño()) {
            return true;
        } else if (this.año > otraFecha.getAño()) {
            return false;
        } else if (this.mes < otraFecha.getMes()) {
            return true;
        } else if (this.mes > otraFecha.getMes()) {
            return false;
        } else {
            return this.dia < otraFecha.getDia();
        }
    }
    
    public boolean mayor(Fecha otraFecha) {
        if (this.año > otraFecha.getAño()) {
            return true;
        } else if (this.año < otraFecha.getAño()) {
            return false;
        } else if (this.mes > otraFecha.getMes()) {
            return true;
        } else if (this.mes < otraFecha.getMes()) {
            return false;
        } else {
            return this.dia > otraFecha.getDia();
        }
    }

    public boolean igual(Fecha otraFecha){
        if (this.año == otraFecha.getAño() && this.mes == otraFecha.getMes() && this.dia == otraFecha.getDia()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean fechaCorrecta(){
        int [] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dia <= diasPorMes[mes] && mes <= 12 && año >= 0) {
            return true;
        } else {
            return false;
        }
    }

}
