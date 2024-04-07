package Tema_7.Actividad_78;

public class NodoRed {

    private String nombreEquipo, direccionIp, máscaraRed, direccionBroadcast, puertaEnlace, direccionRed, servidoresDNS;

    private static int contadorInstacias  = 0;

    public NodoRed(String nombreEquipo, String direccionIp, String máscaraRed, String direccionBroadcast,
            String puertaEnlace, String direccionRed, String servidoresDNS) {
        this.nombreEquipo = nombreEquipo;
        this.direccionIp = direccionIp;
        this.máscaraRed = máscaraRed;
        this.direccionBroadcast = direccionBroadcast;
        this.puertaEnlace = puertaEnlace;
        this.direccionRed = direccionRed;
        this.servidoresDNS = servidoresDNS;

        contadorInstacias++;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getMáscaraRed() {
        return máscaraRed;
    }

    public void setMáscaraRed(String máscaraRed) {
        this.máscaraRed = máscaraRed;
    }

    public String getDireccionBroadcast() {
        return direccionBroadcast;
    }

    public void setDireccionBroadcast(String direccionBroadcast) {
        this.direccionBroadcast = direccionBroadcast;
    }

    public String getPuertaEnlace() {
        return puertaEnlace;
    }

    public void setPuertaEnlace(String puertaEnlace) {
        this.puertaEnlace = puertaEnlace;
    }

    public String getDireccionRed() {
        return direccionRed;
    }

    public void setDireccionRed(String direccionRed) {
        this.direccionRed = direccionRed;
    }

    public String getServidoresDNS() {
        return servidoresDNS;
    }

    public void setServidoresDNS(String servidoresDNS) {
        this.servidoresDNS = servidoresDNS;
    }

    public static int getContadorInstacias() {
        return contadorInstacias;
    }

    public static void setContadorInstacias(int contadorInstacias) {
        NodoRed.contadorInstacias = contadorInstacias;
    }

    public void mostrarDatos(){
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("Direccion IP: " + direccionIp);
        System.out.println("Máscara de red: " + máscaraRed);
        System.out.println("Dirección de Broadcast: " + direccionBroadcast);
        System.out.println("Puerta de enlace: " + puertaEnlace);
        System.out.println("Direccion de red:" + direccionRed);
        System.out.println("Servidores DNS " + servidoresDNS);
        
    }
    
    
}
