package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "statusId")
@ToString(of = {"status"})
public class Status {

    Integer statusId;
    String status;
}