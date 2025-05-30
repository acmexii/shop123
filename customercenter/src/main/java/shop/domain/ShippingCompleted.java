package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class ShippingCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String address;
    private String status;
    private Date deliveryDt;
}
