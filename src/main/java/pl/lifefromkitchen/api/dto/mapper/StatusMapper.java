package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.StatusDTO;
import pl.lifefromkitchen.domain.Status;

@Mapper(componentModel = "spring")
public interface StatusMapper {

    StatusMapper INSTANCE = Mappers.getMapper(StatusMapper.class);

    StatusDTO mapToDTO(Status status);
}
