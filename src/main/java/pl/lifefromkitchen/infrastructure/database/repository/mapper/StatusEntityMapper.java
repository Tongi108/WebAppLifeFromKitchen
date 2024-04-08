package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.Status;
import pl.lifefromkitchen.infrastructure.database.entity.StatusEntity;

@Mapper(componentModel = "spring")
public interface StatusEntityMapper {


    StatusEntityMapper INSTANCE = Mappers.getMapper(StatusEntityMapper.class);

    @Mapping(target = "orderHeaders", ignore = true)
    Status mapFromEntity(StatusEntity statusEntity);

}
