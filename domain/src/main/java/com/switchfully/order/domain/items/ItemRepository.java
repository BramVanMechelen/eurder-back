package com.switchfully.order.domain.items;

import com.switchfully.order.domain.Repository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.stream.Collectors;

@Named
public class ItemRepository extends Repository<Item, ItemDatabase> {

    public Item getItemByName(String name){
        return getDatabase().getAll().values().stream().filter(item -> item.getName().equals(name)).findFirst().orElse(null);
    }

    @Inject
    public ItemRepository(ItemDatabase database) {
        super(database);
    }
}
