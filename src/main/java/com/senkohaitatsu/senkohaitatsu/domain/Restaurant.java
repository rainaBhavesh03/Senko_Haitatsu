package com.senkohaitatsu.senkohaitatsu.domain;
import java.util.Vector;
import javax.persistence.Entity;

@Entity
public class Restaurant extends Business{
    private Vector<Item> itemList;  //TODO: make  it so that while initilizing this, the itemType is always DISH

    public Vector<Item> getItemList() {
        return itemList;
    }

    public void setItemList(Vector<Item> itemList) {    //TODO: check how to enter the elements(Item) for this vector
        this.itemList = itemList;
    }
}
