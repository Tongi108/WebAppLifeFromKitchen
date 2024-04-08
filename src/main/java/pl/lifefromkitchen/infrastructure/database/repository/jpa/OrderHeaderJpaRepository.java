package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.infrastructure.database.entity.OrderHeaderEntity;

@Repository
public interface OrderHeaderJpaRepository extends JpaRepository<OrderHeaderEntity, Integer> {
}
