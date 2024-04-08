package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.MenuItemCategory;
import pl.lifefromkitchen.infrastructure.database.entity.MenuItemCategoryEntity;

@Mapper(componentModel = "spring")
public interface MenuItemCategoryEntityMapper {

    MenuItemCategoryEntityMapper INSTANCE = Mappers.getMapper(MenuItemCategoryEntityMapper.class);

    @Mapping(target = "menuItems", ignore = true)
    MenuItemCategory mapFromEntity(MenuItemCategoryEntity menuItemCategoryEntity);
}
