package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.MenuCategoryDTO;
import pl.lifefromkitchen.domain.MenuCategory;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuCategoryMapper {

    MenuCategoryMapper INSTANCE = Mappers.getMapper(MenuCategoryMapper.class);

    MenuCategoryDTO mapToDTO(MenuCategory menuCategory);

    List<MenuCategoryDTO> mapToDTOs(List<MenuCategory> menuCategoryByProducerName);

}
