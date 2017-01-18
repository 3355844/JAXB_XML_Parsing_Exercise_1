import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by 33558 on 18.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("trains.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Trains trains = (Trains) unmarshaller.unmarshal(file);
            System.out.println(trains.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
