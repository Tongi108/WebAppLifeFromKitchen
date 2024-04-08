package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.DeliveryAddressDTO;
import pl.lifefromkitchen.domain.DeliveryAddress;

@Mapper(componentModel = "spring")
public interface DeliveryAddressMapper {

    DeliveryAddressMapper INSTANCE = Mappers.getMapper(DeliveryAddressMapper.class);

    DeliveryAddressDTO mapToDTO(DeliveryAddress deliveryAddress);

}
