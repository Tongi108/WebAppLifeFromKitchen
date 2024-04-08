package pl.lifefromkitchen.domain;

import lombok.*;
import pl.lifefromkitchen.infrastructure.database.entity.OrderHeaderEntity;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "statusId")
@ToString(of = {"status"})
public class Status {

    Integer statusId;
    String status;
    Set<OrderHeaderEntity> orderHeaders;
}