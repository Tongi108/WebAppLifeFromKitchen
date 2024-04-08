package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.MenuDTO;
import pl.lifefromkitchen.domain.Menu;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuMapper {

    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    MenuDTO mapToDTO(Menu menu);

    List<MenuDTO> mapToDTOs(List<Menu> menu);
}
