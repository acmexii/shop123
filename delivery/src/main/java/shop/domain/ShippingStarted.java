package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ShippingStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String address;
    private String status;
    private Date deliveryDt;

    public ShippingStarted(Delivery aggregate) {
        super(aggregate);
    }

    public ShippingStarted() {
        super();
    }
}
//>>> DDD / Domain Event
