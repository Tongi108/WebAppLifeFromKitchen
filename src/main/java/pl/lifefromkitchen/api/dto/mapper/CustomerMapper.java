package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.CustomerDTO;
import pl.lifefromkitchen.domain.Customer;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO mapToDTO(Customer customer);




    List<CustomerDTO> mapToDTOs(List<Customer> customers);
}
