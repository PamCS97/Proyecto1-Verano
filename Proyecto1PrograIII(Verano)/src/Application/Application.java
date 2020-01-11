package Application;

import MapaSismologico.Logica.Sismo;
import MapaSismologico.control.ControlAplicacion;
import MapaSismologico.modelo.Modelo;
import MapaSismologico.vista.VentanaAplicacion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Pamela
 */
public class Application {

    public static void main(String args[]) throws JAXBException, FileNotFoundException, IOException, ParseException {               
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | UnsupportedLookAndFeelException e) {
        }

        new Application().init();
    }

    public void init() {
        SwingUtilities.invokeLater(() -> {
            try {
                mostrarInterfaz();
            } catch (IOException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JAXBException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void mostrarInterfaz() throws JAXBException, IOException, FileNotFoundException, ParseException{
        Modelo model = new Modelo();
        MapaSismologico.Edicion.Model modeloEdicion = new MapaSismologico.Edicion.Model();
        MapaSismologico.Listado.Model modeloListado = new  MapaSismologico.Listado.Model(); 
        MapaSismologico.Edicion.View viewEdicion = new   MapaSismologico.Edicion.View();
        MapaSismologico.Listado.View viewListado = new   MapaSismologico.Listado.View();
        
        ControlAplicacion gestorPrincipal = new ControlAplicacion(model);
        MapaSismologico.vista.VentanaAplicacion viewPrincipal = new MapaSismologico.vista.VentanaAplicacion(gestorPrincipal);
        MapaSismologico.Edicion.Controller controllerEdicion = new MapaSismologico.Edicion.Controller(modeloEdicion,viewEdicion);
        MapaSismologico.Listado.Controller controllerListado = new MapaSismologico.Listado.Controller(modeloListado,viewListado);
            try {
                viewPrincipal.init();
                viewPrincipal.panel.add(viewEdicion);
                viewPrincipal.panel.add(viewListado);
                leerDatosTXT();
                
            } catch (IOException ex) {
                 Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
     
    public static MapaSismologico.Edicion.Controller EDICION_CONTROLLER;
    public static MapaSismologico.Listado.Controller LISTADO_CONTROLLER;
    
   public void leerDatosTXT() throws FileNotFoundException, IOException, ParseException{
       List<Sismo> lista = new ArrayList<>();
        String cadena;
        int secuenciaRegistro;
        int secuenciaAnnio;
        Date fechaEvento;
        float longitud;
        float latitud;
        float magnitudEvento;
        float profundidadEvento;
        SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy"); 
        FileReader f = new FileReader("datos (prueba).txt");
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            String[] cadena2 = cadena.split("\t");
            secuenciaRegistro = Integer.parseInt(cadena2[0]);
            secuenciaAnnio = Integer.parseInt(cadena2[1]);
            fechaEvento = formato.parse(cadena2[2]);
            longitud = Float.parseFloat(cadena2[3]);
            latitud = Float.parseFloat(cadena2[4]);
            magnitudEvento = Float.parseFloat(cadena2[5]);
            profundidadEvento = Float.parseFloat(cadena2[6]);
            Sismo s = new Sismo(secuenciaRegistro,secuenciaAnnio,fechaEvento,longitud
                    ,latitud,magnitudEvento,profundidadEvento);
            lista.add(s);
        }
        b.close();
        System.out.println(lista);
   }
}
