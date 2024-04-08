package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.OrderHeader;
import pl.lifefromkitchen.infrastructure.database.entity.OrderHeaderEntity;

@Mapper(componentModel = "spring")
public interface OrderHeaderEntityMapper {

    OrderHeaderEntityMapper INSTANCE = Mappers.getMapper(OrderHeaderEntityMapper.class);

    @Mapping(target = "status", ignore = true)
    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "producer", ignore = true)
    @Mapping(target = "orderDetails", ignore = true)
    OrderHeader mapFromEntity(OrderHeaderEntity orderHeaderEntity);

}
