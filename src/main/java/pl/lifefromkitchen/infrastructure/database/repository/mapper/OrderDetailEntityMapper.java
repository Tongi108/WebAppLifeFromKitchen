package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.OrderDetail;
import pl.lifefromkitchen.infrastructure.database.entity.OrderDetailEntity;

@Mapper(componentModel = "spring")
public interface OrderDetailEntityMapper {

    OrderDetailEntityMapper INSTANCE = Mappers.getMapper(OrderDetailEntityMapper.class);

    @Mapping(target = "orderHeader", ignore = true)
    @Mapping(target = "menuItem", ignore = true)
    OrderDetail mapFromEntity(OrderDetailEntity orderDetailEntity);
}
