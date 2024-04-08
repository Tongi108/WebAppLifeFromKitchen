package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.Customer;
import pl.lifefromkitchen.infrastructure.database.entity.CustomerEntity;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntityMapper INSTANCE = Mappers.getMapper(CustomerEntityMapper.class);

    @Mapping(target = "address", ignore = true)
    @Mapping(target = "orderHeaders", ignore = true)
    Customer mapFromEntity(CustomerEntity CustomerEntity);

}
