package MapaSismologico.Logica;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Pamela
 */
@XmlRootElement(name="longitude")
@XmlType(propOrder={"longitudeDeegres","minutes","seconds",
                    "longitudeDirection"})
public class Longitude {

    public Longitude() {
    }

    @XmlElement(name="longitude-degrees")
    public String getLongitudeDeegres() {
        return longitudeDeegres;
    }

    public void setLongitudeDeegres(String longitudeDeegres) {
        this.longitudeDeegres = longitudeDeegres;
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

    @XmlElement(name="longitude-direction")
    public String getLongitudeDirection() {
        return longitudeDirection;
    }

    public void setLongitudeDirection(String longitudeDirection) {
        this.longitudeDirection = longitudeDirection;
    }

    
    
private String longitudeDeegres;
private String minutes;
private String seconds;
private String longitudeDirection;

    
}
