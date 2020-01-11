package MapaSismologico.Logica;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Pamela
 */
@XmlRootElement(name="image-position")
@XmlType(propOrder={"x","y"})
public class ImagePosition {

    public ImagePosition() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
private int x;
private int y;
}
