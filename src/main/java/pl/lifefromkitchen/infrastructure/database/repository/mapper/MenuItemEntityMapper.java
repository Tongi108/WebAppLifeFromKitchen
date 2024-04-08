package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.MenuItem;
import pl.lifefromkitchen.infrastructure.database.entity.MenuItemEntity;

@Mapper(componentModel = "spring")
public interface MenuItemEntityMapper {

    MenuItemEntityMapper INSTANCE = Mappers.getMapper(MenuItemEntityMapper.class);

    MenuItem mapFromEntity(MenuItemEntity menuItemEntity);

}
