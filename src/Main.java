import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.time.LocalTime;

/**
 * Created by 33558 on 18.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("trains.xml");
        LocalTime timeTo = LocalTime.of(13, 30);
        LocalTime timeFrom = LocalTime.of(19, 30);
        Trains trains = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            trains = (Trains) unmarshaller.unmarshal(file);
            System.out.println(trains.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------------");
        trains = checkTrainsFromTo(trains, timeTo, timeFrom);
        System.out.println(trains.toString());
    }

    private static Trains checkTrainsFromTo(Trains trains, LocalTime timeTo, LocalTime timeFrom) {
        Trains tmpTrains = null;
        System.out.println("TimeTo = " + timeTo + " TimeFrom = " + timeFrom + " ");
        System.out.println("-----------------------------------");
        try {
            tmpTrains = Trains.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        for (Train train : trains.getTrains()) {
            if (train.getDeparture().isAfter(timeTo) && train.getDeparture().isBefore(timeFrom)) {
                tmpTrains.add(train);
            }
        }
        return tmpTrains;
    }
}
