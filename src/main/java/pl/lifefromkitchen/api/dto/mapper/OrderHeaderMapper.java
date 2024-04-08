package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.OrderHeaderDTO;
import pl.lifefromkitchen.domain.OrderHeader;

@Mapper(componentModel = "spring")
public interface OrderHeaderMapper {

    OrderHeaderMapper INSTANCE = Mappers.getMapper(OrderHeaderMapper.class);

    OrderHeaderDTO mapToDTO(OrderHeader orderHeader);
}
