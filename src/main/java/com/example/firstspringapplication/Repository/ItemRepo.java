package com.example.firstspringapplication.Repository;
import com.example.firstspringapplication.Model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepo {

    public List<Item> fetchAllItems() {

        // This is where the actual SQL communication would have been done

        List<Item> Items = new ArrayList<>();
        Items.add(new Item("Computer",100));
        Items.add(new Item("Laptop",150));
        Items.add(new Item("iPhone",125));

        return Items;
    }
}
