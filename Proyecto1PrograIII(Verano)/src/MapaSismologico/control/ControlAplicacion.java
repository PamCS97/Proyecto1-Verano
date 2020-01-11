package MapaSismologico.control;

import MapaSismologico.Logica.Coordinate;
import java.util.Observer;
import MapaSismologico.modelo.Modelo;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;

public class ControlAplicacion {

    public ControlAplicacion(Modelo datos) {
        this.datos = datos;
    }

    public void registrar(Observer obs) {
        datos.addObserver(obs);
    }

    public void actualizar() {
        datos.update();
    }

    public ArrayList<Coordinate> dibujaCoordenadas() throws JAXBException {
        return datos.dibujaCoordenadas();
    }

    public void EdicionShow() {
        // Application.Application.EDICION_CONTROLLER.show();
    }

    public void ListadoShow() {
       // Application.Application.LISTADO_CONTROLLER.show();
    }

    private Modelo datos;
}
