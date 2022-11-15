package com.senkohaitatsu.senkohaitatsu.domain;
import java.util.Vector;
import javax.persistence.Entity;

@Entity
public class CommercialStore extends Business{
    private Vector<Item> itemList;

    public Vector<Item> getItemList() {
        return itemList;
    }

    public void setItemList(Vector<Item> itemList) {    //TODO: check how to enter the elements(Item) for this vector
        this.itemList = itemList;
    }
}
