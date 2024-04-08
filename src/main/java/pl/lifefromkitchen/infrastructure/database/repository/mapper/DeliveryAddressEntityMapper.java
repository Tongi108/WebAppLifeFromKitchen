package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.DeliveryAddress;
import pl.lifefromkitchen.infrastructure.database.entity.DeliveryAddressEntity;

@Mapper(componentModel = "spring")
public interface DeliveryAddressEntityMapper {

    DeliveryAddressEntityMapper INSTANCE = Mappers.getMapper(DeliveryAddressEntityMapper.class);

    @Mapping(target = "producers", ignore = true)
    DeliveryAddress mapFromEntity(DeliveryAddressEntity DeliveryAddressEntity);

}
