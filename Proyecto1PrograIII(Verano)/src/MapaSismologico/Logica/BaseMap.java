package MapaSismologico.Logica;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pamela
 */
@XmlRootElement(name="base-map")
public class BaseMap {

    public BaseMap() {
        coordinates = new ArrayList();
        image = new Image();
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @XmlElementWrapper(name="coordinates")
    @XmlElement(name="coordinate")
    public ArrayList<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    
    
private Image image;
private ArrayList<Coordinate> coordinates;

}
