package MapaSismologico.Listado;

import MapaSismologico.Logica.Sismo;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author abigail
 */
public class Model extends Observable {
     ArrayList<Sismo> eventos;

    void addOserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
