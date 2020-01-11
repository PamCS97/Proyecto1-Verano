/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapaSismologico.Edicion;

import MapaSismologico.Logica.Sismo;
import java.util.Observable;
import java.util.Observer;


public class Model extends Observable {
    Sismo sismo;

    public Model() {
        
    }

    public Sismo getSismo() {
        return sismo;
    }

    public void setSismo(Sismo sismo) {
        this.sismo = sismo;
         this.setChanged();
        this.notifyObservers();
    
    }
        public void addOserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();
    }
    
}

