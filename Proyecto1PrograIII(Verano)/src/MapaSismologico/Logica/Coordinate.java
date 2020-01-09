package MapaSismologico.Logica;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Pamela
 */
@XmlRootElement(name="coordinate")
@XmlType(propOrder={"label","imagePosition","mapPosition"})
public class Coordinate {

    public Coordinate() {
    }

    @XmlAttribute(name="label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @XmlElement(name="image-position")
    public ImagePosition getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(ImagePosition imagePosition) {
        this.imagePosition = imagePosition;
    }

    @XmlElement(name="map-position")
    public MapPosition getMapPosition() {
        return mapPosition;
    }

    public void setMapPosition(MapPosition mapPosition) {
        this.mapPosition = mapPosition;
    }

    
    
private String label;
private ImagePosition imagePosition;
private MapPosition mapPosition;

}
