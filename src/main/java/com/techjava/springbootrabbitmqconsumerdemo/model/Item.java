package com.techjava.springbootrabbitmqconsumerdemo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "@id", scope = Item.class)
public class Item {

    private String itemName;

    private Category category;

    public Item() {
    }

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public Item(String itemName, Category category) {
        this.itemName = itemName;
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
