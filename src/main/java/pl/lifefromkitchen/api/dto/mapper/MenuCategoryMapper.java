package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.MenuCategoryDTO;
import pl.lifefromkitchen.domain.MenuCategory;

@Mapper(componentModel = "spring")
public interface MenuCategoryMapper {

    MenuCategoryMapper INSTANCE = Mappers.getMapper(MenuCategoryMapper.class);

    MenuCategoryDTO mapToDTO(MenuCategory menuCategory);
}
