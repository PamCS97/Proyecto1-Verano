package MapaSismologico;
import MapaSismologico.Logica.Coordenada;
import MapaSismologico.control.ControlAplicacion;
import MapaSismologico.vista.VentanaAplicacion;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
        coordenadas = new Coordenada();
            try {
                new VentanaAplicacion(gestorPrincipal).init();
                coordenadas.leerXML("map.xml");
            } catch (IOException ex) {
                Logger.getLogger(MapaSismologico.class.getName()).log(Level.SEVERE, null, ex);
            }
    }


    private Coordenada coordenadas;
}
