package pl.lifefromkitchen.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.lifefromkitchen.domain.Menu;
import pl.lifefromkitchen.infrastructure.database.entity.MenuEntity;

@Mapper(componentModel = "spring")
public interface MenuEntityMapper {

    MenuEntityMapper INSTANCE = Mappers.getMapper(MenuEntityMapper.class);

    @Mapping(target = "producer", ignore = true)
    @Mapping(target = "menuCategory", ignore = true)
    @Mapping(target = "menuOfItems", ignore = true)
    Menu mapFromEntity(MenuEntity menuEntity);

}
