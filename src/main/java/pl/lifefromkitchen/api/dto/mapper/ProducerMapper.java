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

    List<ProducerDTO> mapToDTOs(List<Producer> producers);

    List<String> mapToDTOsString(List<String> city);

}
