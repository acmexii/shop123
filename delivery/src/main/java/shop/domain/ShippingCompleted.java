package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ShippingCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String address;
    private String status;
    private Date deliveryDt;

    public ShippingCompleted(Delivery aggregate) {
        super(aggregate);
    }

    public ShippingCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
