import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 33558 on 18.01.2017.
 */
@XmlRootElement(name = "trains")
public class Trains {
    @XmlElement(name = "train")
    private ArrayList<Train> trains;

    public void add(Train train){
        trains.add(train);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(trains.toArray());
    }
}
