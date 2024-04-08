package pl.lifefromkitchen.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lifefromkitchen.domain.Status;

import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeaderDTO {

    OffsetDateTime dateTime;
    Status status;
}
