package pl.lifefromkitchen.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lifefromkitchen.domain.MenuItem;
import pl.lifefromkitchen.domain.OrderHeader;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDTO {

    String orderNumber;
    BigDecimal totalPrice;
    OrderHeader orderHeader;
    MenuItem menuItem;
}
