package MapaSismologico;
import MapaSismologico.control.ControlAplicacion;
import MapaSismologico.vista.VentanaAplicacion;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
            configure();
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | IOException
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

    private static void configure() throws IOException {
        InputStream in = MapaSismologico.class.getResourceAsStream("vista/imagenes/MapaCR.png");
        ImageIcon icon = new ImageIcon(ImageIO.read(in));

        UIManager.put("OptionPane.warningIcon", icon); 
    }

    
}
