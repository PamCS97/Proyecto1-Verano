package MapaSismologico.Logica;

import java.util.Date;

/**
 *
 * @author Pamela
 */
public class Sismo {

    public Sismo(int secuenciaRegistro, int secuenciaAnnio, Date fechaEvento, float longitud, float latitud, float magnitudEvento, float profundidadEvento) {
        this.secuenciaRegistro = secuenciaRegistro;
        this.secuenciaAnnio = secuenciaAnnio;
        this.fechaEvento = fechaEvento;
        this.longitud = longitud;
        this.latitud = latitud;
        this.magnitudEvento = magnitudEvento;
        this.profundidadEvento = profundidadEvento;
    }

    public int getSecuenciaRegistro() {
        return secuenciaRegistro;
    }

    public void setSecuenciaRegistro(int secuenciaRegistro) {
        this.secuenciaRegistro = secuenciaRegistro;
    }

    public int getSecuenciaAnnio() {
        return secuenciaAnnio;
    }

    public void setSecuenciaAnnio(int secuenciaAnnio) {
        this.secuenciaAnnio = secuenciaAnnio;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getMagnitudEvento() {
        return magnitudEvento;
    }

    public void setMagnitudEvento(float magnitudEvento) {
        this.magnitudEvento = magnitudEvento;
    }

    public float getProfundidadEvento() {
        return profundidadEvento;
    }

    public void setProfundidadEvento(float profundidadEvento) {
        this.profundidadEvento = profundidadEvento;
    }
    
    @Override
    public String toString(){
        String cadena = secuenciaRegistro+" "+secuenciaAnnio+" "+fechaEvento+" "+
                longitud+" "+latitud+" "+magnitudEvento+" "+profundidadEvento;
        return cadena;
    }
    private int secuenciaRegistro;
    private int secuenciaAnnio;
    private Date fechaEvento;
    private float longitud;
    private float latitud;
    private float magnitudEvento;
    private float profundidadEvento;

}
