package pl.lifefromkitchen.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.api.dto.MenuItemDTO;
import pl.lifefromkitchen.domain.MenuItem;
@Mapper(componentModel = "spring")
public interface MenuItemMapper {

    MenuItemMapper INSTANCE = Mappers.getMapper(MenuItemMapper.class);

    MenuItemDTO mapToDTO(MenuItem menuItem);
}
