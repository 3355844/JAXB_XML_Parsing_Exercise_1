import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

/**
 * Created by 33558 on 19.01.2017.
 */
public class DataAdapter extends XmlAdapter<String , LocalDate> {

    @Override
    public LocalDate unmarshal(String stringDate) throws Exception {
        System.out.println(stringDate);
        return LocalDate.parse(stringDate, Train.DATA_FORMAT) ;
    }

    @Override
    public String marshal(LocalDate date) throws Exception {
        System.out.println(date);
        return date.format(Train.DATA_FORMAT);
    }
}
