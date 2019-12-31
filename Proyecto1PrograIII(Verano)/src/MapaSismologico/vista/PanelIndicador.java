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

public class PanelIndicador extends JPanel {

    public PanelIndicador(ControlAplicacion nuevoGestor, int i, int j, int posicion) {
        super();
        this.gestorPrincipal = nuevoGestor;
        configurar();
    }

    private void configurar() {
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

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

    
    private final ControlAplicacion gestorPrincipal;
    
}
