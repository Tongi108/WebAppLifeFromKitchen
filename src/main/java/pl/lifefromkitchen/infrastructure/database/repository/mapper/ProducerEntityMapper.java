package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.Producer;
import pl.lifefromkitchen.infrastructure.database.entity.ProducerEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProducerEntityMapper {

    ProducerEntityMapper INSTANCE = Mappers.getMapper(ProducerEntityMapper.class);

    @Mapping(target = "orderHeaders", ignore = true)
    @Mapping(target = "deliveryAddresses", ignore = true)
    @Mapping(target = "menus", ignore = true)
    Producer mapFromEntity(ProducerEntity producerEntity);


}
