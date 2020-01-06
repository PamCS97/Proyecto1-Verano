package MapaSismologico;
import MapaSismologico.Logica.Coordenada;
import MapaSismologico.control.ControlAplicacion;
import MapaSismologico.vista.VentanaAplicacion;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Pamela
 */
public class MapaSismologico {

        public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | UnsupportedLookAndFeelException e) {
        }

        new MapaSismologico().init();
    }

    public void init() {
        SwingUtilities.invokeLater(() -> {
            mostrarInterfaz();
        });
    }

    public void mostrarInterfaz(){
        ControlAplicacion gestorPrincipal = new ControlAplicacion();
            try {
                new VentanaAplicacion(gestorPrincipal).init();
            } catch (IOException ex) {
                Logger.getLogger(MapaSismologico.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
     public static void readXML(InputStream in) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(MapaSismologico.class);
        Unmarshaller mrs = ctx.createUnmarshaller();
        MapaSismologico m = (MapaSismologico) mrs.unmarshal(in);

        graphs.Graph<String, Double> r = new graphs.Graph<>();
        List<Vertex> vs = m.getVertices().getVertices();
        if (vs != null) {
            for (Vertex v : vs) {
                r.add(v.getInfo(),
                        new Point2D.Float(
                                v.getPosition().getX(),
                                v.getPosition().getY()
                        ));
            }
        }
        List<Edge> es = m.getEdges().getEdges();
        if (es != null) {
            for (Edge e : es) {
                String t0 = findVertex(m, e.getTail());
                String t1 = findVertex(m, e.getHead());
                r.add(t0, t1);
            }
        }

        return r;
    }


}
