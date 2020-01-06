package MapaSismologico.Logica;

/**
 *
 * @author Pamela
 */
public class MapPosition {

    public MapPosition(GeographicCoord latitude, GeographicCoord longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    
    private GeographicCoord latitude;
    private GeographicCoord longitude;
    
}
