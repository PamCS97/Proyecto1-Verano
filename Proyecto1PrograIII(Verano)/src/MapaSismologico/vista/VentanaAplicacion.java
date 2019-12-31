package MapaSismologico.vista;
import MapaSismologico.control.ControlAplicacion;
import MapaSismologico.modelo.Modelo;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Point;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class VentanaAplicacion extends JFrame implements Observer {

    public VentanaAplicacion(ControlAplicacion nuevoGestor) throws IOException {
        super();
        this.gestorPrincipal = nuevoGestor;
        configurar();
    }

    private void configurar(){
        ajustarComponentes(getContentPane());
        setResizable(false);
        setSize(900,700);
        setLocationByPlatform(true);
        setTitle("Mapa Sismológico");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void ajustarComponentes(Container c){
        c.setLayout(new BorderLayout());
        panelIndicador= new PanelIndicador(gestorPrincipal);
        c.add(BorderLayout.CENTER, panelIndicador);

    }

    public void init() throws IOException {
        gestorPrincipal.registrar(this);
        setVisible(true);
        gestorPrincipal.actualizar();
    }
    
    @Override
    public void update(Observable s, Object evt) {
        Modelo m = (Modelo) s;
        if (evt != null) {
            Point loc = (Point) evt;
        }

    }

    private final ControlAplicacion gestorPrincipal;
    private PanelIndicador panelIndicador;
   }
