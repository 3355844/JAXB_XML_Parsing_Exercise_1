import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

/**
 * Created by 33558 on 19.01.2017.
 */
public class DataAdapter extends XmlAdapter<String , LocalDate> {

    @Override
    public LocalDate unmarshal(String s) throws Exception {
        System.out.println(s);
        return LocalDate.parse(s, Train.DATA_FORMAT) ;
    }

    @Override
    public String marshal(LocalDate d) throws Exception {
        System.out.println(d);
        return d.format(Train.DATA_FORMAT);
    }
}
