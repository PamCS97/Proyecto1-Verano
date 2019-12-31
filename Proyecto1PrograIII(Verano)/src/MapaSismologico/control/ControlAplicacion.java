package MapaSismologico.control;

import java.util.Observer;
import MapaSismologico.modelo.Modelo;

public class ControlAplicacion {

    public ControlAplicacion(Modelo datos) {
        this.datos = datos;
    }

    public ControlAplicacion() {
        this(Modelo.obtenerInstancia());
    }

    public void registrar(Observer obs) {
        datos.addObserver(obs);
    }

    public void actualizar() {
        datos.update();
    }

    public void marcar(int i, int j, int posicion) throws IllegalArgumentException {
        if (datos.verificarTurno(posicion)) {
            System.out.printf("i: %d, j: %d, p: %d%n", i, j, posicion);
            datos.marcar(i, j, posicion);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private Modelo datos;
}
