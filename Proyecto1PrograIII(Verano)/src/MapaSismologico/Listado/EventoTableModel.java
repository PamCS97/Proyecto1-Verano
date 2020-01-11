/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapaSismologico.Listado;

import MapaSismologico.Logica.Sismo;
import java.util.ArrayList;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author abigail
 */
public class EventoTableModel extends AbstractTableModel {
 ArrayList<Sismo> sismos;
    int[] columnas;

    public EventoTableModel(ArrayList<Sismo> sismos, int[] columnas) {
        this.sismos = sismos;
        this.columnas = columnas;
    }

    public ArrayList<Sismo> getSismos() {
        return sismos;
    }

    public void setSismos(ArrayList<Sismo> sismos) {
        this.sismos = sismos;
    }

    public int[] getColumnas() {
        return columnas;
    }

    public void setColumnas(int[] columnas) {
        this.columnas = columnas;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
    
    
    @Override
    public int getRowCount() {
      return sismos.size(); //To change body of generated methods, choose Tools | Templates.
    
    }
 public Sismo getRowAt(int row) {
        return sismos.get(row);
    }
    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
