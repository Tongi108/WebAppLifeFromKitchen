package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.lifefromkitchen.domain.MenuItem;
import pl.lifefromkitchen.domain.OrderHeader;

import java.math.BigDecimal;
@Getter
@Setter
@EqualsAndHashCode(of = "orderDetailId")
@ToString(of = {"orderDetailId", "orderNumber"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_detail")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    Integer orderDetailId;

    
    String orderNumber;
    BigDecimal totalPrice;
    OrderHeader orderHeader;
    MenuItem menuItem;
}
