package MapaSismologico.Logica;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Pamela
 */
public class Coordenada {
    
    public Coordenada(){
        
    }
    
public void leerXML(String archivo){
     try {
            JAXBContext ctx = JAXBContext.newInstance(Coordenada.class);
            Unmarshaller mrs = ctx.createUnmarshaller();
            Object obj = mrs.unmarshal(new File(archivo));
            System.out.println(obj);

        } catch (JAXBException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
}
  
private ImagePosition imgPos;
private MapPosition mapPos;

}
