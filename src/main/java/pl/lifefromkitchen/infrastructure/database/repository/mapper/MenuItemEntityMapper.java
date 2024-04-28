package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.MenuItem;
import pl.lifefromkitchen.infrastructure.database.entity.MenuItemEntity;

@Mapper(componentModel = "spring")
public interface MenuItemEntityMapper {

    MenuItemEntityMapper INSTANCE = Mappers.getMapper(MenuItemEntityMapper.class);
    @Mapping(target = "menuItemCategory", ignore = true)
    @Mapping(target = "menus", ignore = true)
    @Mapping(target = "orderDetails", ignore = true)
    MenuItem mapFromEntity(MenuItemEntity menuItemEntity);

}
