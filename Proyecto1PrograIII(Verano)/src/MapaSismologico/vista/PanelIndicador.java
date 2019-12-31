package MapaSismologico.vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import MapaSismologico.control.ControlAplicacion;
import java.awt.Image;
import javax.swing.ImageIcon;
public class PanelIndicador extends JPanel {

    public PanelIndicador(ControlAplicacion nuevoGestor) {
        super();
        this.gestorPrincipal = nuevoGestor;
        configurar();
        imagen = new ImageIcon(getClass().getResource("imagenes/MapaCR.png")).getImage();
    }

    private void configurar() {
        setPreferredSize(new Dimension(853,667));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

        });
    }


    @Override
    public void paintComponent(Graphics bg) {
        super.paintComponent(bg);
    }

    @Override 
    public void paint(Graphics g){
        g.drawImage(imagen,0,0,853,667,this);
        setOpaque(false);
        super.paint(g);
    }
    
    private final ControlAplicacion gestorPrincipal;
    private final Image imagen;
   
}
