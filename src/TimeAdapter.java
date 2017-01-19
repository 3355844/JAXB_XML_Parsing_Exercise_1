import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalTime;

/**
 * Created by 33558 on 19.01.2017.
 */
public class TimeAdapter extends XmlAdapter <String, LocalTime>{

    @Override
    public LocalTime unmarshal(String stringTime) throws Exception {
        return LocalTime.parse(stringTime, Train.TIME_FORMATTER);
    }

    @Override
    public String marshal(LocalTime time) throws Exception {
        return time.format(Train.TIME_FORMATTER);
    }
}
