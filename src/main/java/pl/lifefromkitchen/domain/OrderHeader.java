package pl.lifefromkitchen.domain;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "orderHeaderId")
@ToString(of = {"orderHeaderId", "dateTime", "status"})

public class OrderHeader {

    Integer orderHeaderId;
    OffsetDateTime dateTime;
    Status status;
    Customer customer;
    Producer producer;
    Set<OrderDetail> orderDetails;

}
