package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.MenuDTO;
import pl.lifefromkitchen.domain.Menu;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuMapper {

    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

//    @Mapping(target = "menuCategory.name", source = "menuCategory.name")
    MenuDTO mapToDTO(Menu menu);

    List<MenuDTO> mapToDTOs(List<Menu> menu);
}
