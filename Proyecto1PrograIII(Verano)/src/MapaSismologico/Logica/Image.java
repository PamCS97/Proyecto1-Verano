package MapaSismologico.Logica;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Pamela
 */

@XmlRootElement(name="image")
@XmlType(propOrder={"url","dimension"})
public class Image {

    public Image() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

private String url;
private Dimension dimension;
}
