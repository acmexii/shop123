package shop.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import shop.CustomercenterApplication;
import shop.domain.EventRegistered;

@Entity
@Table(name = "Event_table")
@Data
//<<< DDD / Aggregate Root
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String eventNmae;

    private Date from;

    private Date to;

    @PostPersist
    public void onPostPersist() {
        EventRegistered eventRegistered = new EventRegistered(this);
        eventRegistered.publishAfterCommit();
    }

    public static EventRepository repository() {
        EventRepository eventRepository = CustomercenterApplication.applicationContext.getBean(
            EventRepository.class
        );
        return eventRepository;
    }
}
//>>> DDD / Aggregate Root
