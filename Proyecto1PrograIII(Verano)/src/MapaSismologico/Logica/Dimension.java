package MapaSismologico.Logica;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Pamela
 */
@XmlRootElement(name="dimension")
@XmlType(propOrder={"width","height"})
public class Dimension {

    public Dimension() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    private int width;
    private int height;
}
