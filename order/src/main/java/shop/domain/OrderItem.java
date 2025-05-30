package shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Entity
@Data
public class OrderItem {

    private Long id;

    private String productName;

    private Long productId;

    private Integer qty;

    private Float unitPrice;

    @Embedded
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private CompositeId compositeId;

    private String orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    protected OrderItem() {}

    protected OrderItem(
        Long id,
        String productName,
        Long productId,
        Integer qty,
        Float unitPrice,
        String orderId,
        Order order
    ) {
        this.id = id;
        this.productName = productName;
        this.productId = productId;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.orderId = orderId;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQty() {
        return qty;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public String getOrderId() {
        return orderId;
    }
}
