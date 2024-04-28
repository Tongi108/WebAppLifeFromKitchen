package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.MenuItemCategoryDTO;
import pl.lifefromkitchen.domain.MenuItemCategory;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuItemCategoryMapper {

    MenuItemCategoryMapper INSTANCE = Mappers.getMapper(MenuItemCategoryMapper.class);

    MenuItemCategoryDTO mapToDTO(MenuItemCategory menuItemCategory);

    List<MenuItemCategoryDTO> mapToDTOs(List<MenuItemCategory> menuItemCategories);
}
