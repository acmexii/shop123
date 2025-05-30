package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private Long userId;
    private Long productId;
    private String productName;
    private Integer qty;
    private Date orderDt;
    private String status;
}
