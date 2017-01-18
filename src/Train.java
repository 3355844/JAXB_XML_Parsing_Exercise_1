import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by 33558 on 18.01.2017.
 */
@XmlRootElement(name = "train")
public class Train {

    private int id;

    private String from;

    private String to;

    private Date date;

    private Date departure;

    public int getId() {
        return id;
    }
    @XmlElement(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }
    @XmlElement(name = "from")
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }
    @XmlElement(name = "to")
    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }
    @XmlElement(name = "date")
    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeparture() {
        return departure;
    }
    @XmlElement(name = "departure")
    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Train() {
    }

    public Train(int id, String from, String to, Date date, Date departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }
}
