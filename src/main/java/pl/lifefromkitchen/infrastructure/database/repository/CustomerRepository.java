package pl.lifefromkitchen.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.business.dao.CustomerDAO;
@Repository
@AllArgsConstructor
public class CustomerRepository implements CustomerDAO {
}
