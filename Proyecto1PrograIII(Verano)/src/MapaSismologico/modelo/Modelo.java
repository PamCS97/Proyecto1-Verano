package MapaSismologico.modelo;

import MapaSismologico.Logica.BaseMap;
import MapaSismologico.Logica.Coordinate;
import Application.Application;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Modelo extends Observable {

    public Modelo() throws JAXBException {
        coordinates = new ArrayList();
    }

    @Override
    public void addObserver(Observer obs) {
        super.addObserver(obs);
        update();
    }

    public void update() {
        setChanged();
        notifyObservers();
    }

    public void readXML() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(BaseMap.class);
        Logger.getLogger(Application.class.getName());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        BaseMap baseMap = (BaseMap) unmarshaller.unmarshal(new File("map.xml"));
        coordinates = baseMap.getCoordinates();
    }

    public ArrayList<Coordinate> dibujaCoordenadas() throws JAXBException {
        readXML();
        return coordinates;
    }

    private ArrayList<Coordinate> coordinates;
}
