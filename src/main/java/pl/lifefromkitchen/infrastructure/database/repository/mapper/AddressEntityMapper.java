package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.Address;
import pl.lifefromkitchen.infrastructure.database.entity.AddressEntity;

@Mapper(componentModel = "spring")
public interface AddressEntityMapper {

    AddressEntityMapper INSTANCE = Mappers.getMapper(AddressEntityMapper.class);

    @Mapping(target = "customer", ignore = true)
    Address mapFromEntity(AddressEntity addressEntity);

}
