package pl.lifefromkitchen.domain;

import lombok.*;

import java.math.BigDecimal;

@With
@Value
@Builder
@EqualsAndHashCode(of = "orderDetailId")
@ToString(of = {"orderDetailId", "orderNumber", "totalPrice"})
public class OrderDetail {

    Integer orderDetailId;
    String orderNumber;
    BigDecimal totalPrice;
    OrderHeader orderHeader;
    MenuItem menuItem;
}
