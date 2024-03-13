package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.Producer;
import pl.lifefromkitchen.infrastructure.database.entity.ProducerEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProducerEntityMapper {

    ProducerEntityMapper INSTANCE = Mappers.getMapper(ProducerEntityMapper.class);

    Producer mapFromEntity(ProducerEntity producerEntity);
    ProducerEntity mapToEntity(Producer producer);



//    List<Producer> mapFromEntityToList(List<ProducerEntity> producers);

}
