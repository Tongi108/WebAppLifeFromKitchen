package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.MenuCategory;
import pl.lifefromkitchen.infrastructure.database.entity.MenuCategoryEntity;

@Mapper(componentModel = "spring")
public interface MenuCategoryEntityMapper {

    MenuCategoryEntityMapper INSTANCE = Mappers.getMapper(MenuCategoryEntityMapper.class);

    @Mapping(target = "menus", ignore = true)
    MenuCategory mapFromEntity(MenuCategoryEntity menuCategoryEntity);

}
