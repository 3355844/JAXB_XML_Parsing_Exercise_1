import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by 33558 on 18.01.2017.
 */
@XmlRootElement(name = "train")
@XmlAccessorType(XmlAccessType.NONE)
public class Train {

    static DateTimeFormatter DATA_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    static DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
    @XmlAttribute
    private int id;
    @XmlElement
    private String from;
    @XmlElement
    private String to;
    @XmlJavaTypeAdapter(value = DataAdapter.class, type = Date.class)
    private LocalDate date;
    @XmlJavaTypeAdapter(value = TimeAdapter.class, type = Date.class)
    private LocalTime departure;

    public Train() {
    }

    public Train(int id, String from, String to, LocalDate date, LocalTime departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                ", departure=" + departure +
                '}'+"\n";
    }
}
