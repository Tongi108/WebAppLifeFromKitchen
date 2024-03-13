package pl.lifefromkitchen.api.dto.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.ProducerDTO;
import pl.lifefromkitchen.domain.Producer;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ProducerMapper {

    ProducerMapper INSTANCE = Mappers.getMapper(ProducerMapper.class);

    ProducerDTO mapToDTO(Producer producer);
    Producer mapToModel(ProducerDTO producerDTO);



    List<ProducerDTO> mapToDTOs(List<Producer> producers);

}
