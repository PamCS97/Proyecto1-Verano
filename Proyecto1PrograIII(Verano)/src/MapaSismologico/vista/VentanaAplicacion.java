package MapaSismologico.vista;

import MapaSismologico.control.ControlAplicacion;
import MapaSismologico.modelo.Modelo;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Point;
import java.awt.Scrollbar;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class VentanaAplicacion extends JFrame implements Observer {

    public VentanaAplicacion(ControlAplicacion nuevoGestor) throws IOException {
        super();
        this.gestorPrincipal = nuevoGestor;
        configurar();
    }

    private void configurar() {
        ajustarComponentes(getContentPane());
        setSize(853,730);
        setLocationByPlatform(true);
        setTitle("Mapa Sismológico");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    private void ajustarComponentes(Container c) {
        c.setLayout(new BorderLayout());
        panel = new javax.swing.JDesktopPane();
        JPanel panelPrincipal = new JPanel();
        panelPrincipal = new PanelIndicador(gestorPrincipal);
        panelPrincipal.setAutoscrolls(true);
        c.add(BorderLayout.CENTER, panelPrincipal);
        jMenuBar1 = new JMenuBar();
        Menú = new JMenu();
        opcion1 = new JMenuItem();
        opcion2 = new JMenuItem();
        opcion3 = new JMenuItem();
        opcion4 = new JMenuItem();
        Menú.setText("Menú");
        opcion1.setText("Selección de datos");
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });
        Menú.add(opcion1);
        
        opcion2.setText("Tabla de datos");
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });
        Menú.add(opcion2);
        opcion3.setText("Abrir archivo de datos");
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });
        Menú.add(opcion3);
        opcion4.setText("Salir");
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });
        Menú.add(opcion4);
        jMenuBar1.add(Menú);
        setJMenuBar(jMenuBar1);
    }

private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        gestorPrincipal.EdicionShow();
    }

private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        gestorPrincipal.ListadoShow();
    }    

private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
    }    

private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
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
    private JMenu Menú;
    private JMenuBar jMenuBar1;
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;
    private JMenuItem opcion4;
    public javax.swing.JDesktopPane panel;
}
