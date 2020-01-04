package MapaSismologico.Logica;

/**
 *
 * @author Pamela
 */
public class GeographicCoord {

    public GeographicCoord(int Degrees, int minutes, int seconds, String Direction) {
        this.Degrees = Degrees;
        this.minutes = minutes;
        this.seconds = seconds;
        this.Direction = Direction;
    }

private final int Degrees;
private final int minutes;
private final int seconds;
private final String Direction;

}
