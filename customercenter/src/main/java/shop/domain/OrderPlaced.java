package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private Long userId;
    private Long productId;
    private String productName;
    private Integer qty;
    private Date orderDt;
    private String status;
}
