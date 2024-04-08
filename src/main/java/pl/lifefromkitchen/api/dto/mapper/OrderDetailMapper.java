package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.OrderDetailDTO;
import pl.lifefromkitchen.domain.OrderDetail;

@Mapper(componentModel = "spring")
public interface OrderDetailMapper {

    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);

    OrderDetailDTO mapToDTO(OrderDetail orderDetail);
}
