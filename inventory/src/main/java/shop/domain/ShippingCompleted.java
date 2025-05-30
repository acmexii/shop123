package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class ShippingCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String address;
    private String status;
    private Date deliveryDt;
}
