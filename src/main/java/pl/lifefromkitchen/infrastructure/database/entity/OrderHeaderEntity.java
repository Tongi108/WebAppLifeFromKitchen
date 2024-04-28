package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@EqualsAndHashCode(of = "orderHeaderId")
@ToString(of = {"orderHeaderId", "dateTime"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_header")
public class OrderHeaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_header_id")
    private Integer orderHeaderId;

    @Column(name = "date")
    private OffsetDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private StatusEntity status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producer_id")
    private ProducerEntity producer;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderHeader")
    private Set<OrderDetailEntity> orderDetails;
}
