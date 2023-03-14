package com.example.firstspringapplication.Service;
import com.example.firstspringapplication.Model.Item;
import com.example.firstspringapplication.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepo itemRepo;

    public List<Item> fetchAllItems() {
        return itemRepo.fetchAllItems();
    }

}
