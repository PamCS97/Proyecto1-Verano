package MapaSismologico.vista;

import MapaSismologico.Logica.Coordinate;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import MapaSismologico.control.ControlAplicacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.xml.bind.JAXBException;
public class PanelIndicador extends JPanel {

    public PanelIndicador(ControlAplicacion nuevoGestor) {
        super();
        this.gestorPrincipal = nuevoGestor;
        configurar();
        imagen = new ImageIcon(getClass().getResource("imagenes/MapaCR.png")).getImage();
    }

    private void configurar() {
        setPreferredSize(new Dimension(750,650));
        dibujaLabels();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

        });
    }

    public void dibujaLabels(){
        JLabel label = new JLabel("86°0´0'' W");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30,30,30)
                .addComponent(label)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(label)
                .addContainerGap(253, Short.MAX_VALUE))
        );
    }
    

    @Override
    public void paintComponent(Graphics bg) {
        super.paintComponent(bg);
    }

    @Override 
    public void paint(Graphics g){
        try {
            g.drawImage(imagen,0,0,853,667,this);
            setOpaque(false);
            dibujaCoordenadas(gestorPrincipal,g);
            super.paint(g);
        } catch (JAXBException ex) {
            Logger.getLogger(PanelIndicador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public void dibujaCoordenadas(ControlAplicacion control,Graphics g) throws JAXBException{ 
    for(Coordinate c : control.dibujaCoordenadas()){ //dibuja las coordenadas en el mapa
    g.drawLine(0,c.getImagePosition().getY(),853,c.getImagePosition().getY()); //horizontales
    g.drawLine(c.getImagePosition().getX(),0,c.getImagePosition().getX(),667); //verticales
    g.setColor(Color.BLACK);
   
    }
}    
    private final ControlAplicacion gestorPrincipal;
    private final Image imagen;
   
}
