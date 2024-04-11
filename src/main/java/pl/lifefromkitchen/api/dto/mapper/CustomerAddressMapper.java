package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.CustomerAddressDTO;
import pl.lifefromkitchen.domain.CustomerAddress;

@Mapper(componentModel = "spring")
public interface CustomerAddressMapper {

    CustomerAddressMapper INSTANCE = Mappers.getMapper(CustomerAddressMapper.class);

    CustomerAddressDTO mapToDTO(CustomerAddress address);
}
