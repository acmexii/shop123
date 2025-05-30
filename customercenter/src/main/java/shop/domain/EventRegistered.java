package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class EventRegistered extends AbstractEvent {

    private Long id;
    private String eventNmae;
    private Date from;
    private Date to;

    public EventRegistered(Event aggregate) {
        super(aggregate);
    }

    public EventRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
