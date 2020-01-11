package MapaSismologico.Logica;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Pamela
 */
@XmlRootElement(name="latitude")
@XmlType(propOrder={"latitudeDeegres","minutes","seconds",
                    "latitudeDirection"})

public class Latitude {

    public Latitude() {
    }

     @XmlElement(name="latitude-degrees")
    public String getLatitudeDeegres() {
        return latitudeDeegres;
    }

    public void setLatitudeDeegres(String latitudeDeegres) {
        this.latitudeDeegres = latitudeDeegres;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }
    
@XmlElement(name="latitude-direction")
    public String getLatitudeDirection() {
        return latitudeDirection;
    }

    public void setLatitudeDirection(String latitudeDirection) {
        this.latitudeDirection = latitudeDirection;
    }
   
    public String latitudeCompleta(){
        String cadena;
        cadena = latitudeDeegres+"°"+minutes+"´"+seconds+"'' "+latitudeDirection;
        return cadena;
    }
    
private String latitudeDeegres;
private String minutes;
private String seconds;
private String latitudeDirection;

}
