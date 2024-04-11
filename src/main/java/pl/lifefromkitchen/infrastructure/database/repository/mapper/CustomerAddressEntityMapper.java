package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.CustomerAddress;
import pl.lifefromkitchen.infrastructure.database.entity.CustomerAddressEntity;

@Mapper(componentModel = "spring")
public interface CustomerAddressEntityMapper {

    CustomerAddressEntityMapper INSTANCE = Mappers.getMapper(CustomerAddressEntityMapper.class);

    @Mapping(target = "customer", ignore = true)
    CustomerAddress mapFromEntity(CustomerAddressEntity customerAddressEntity);

}
