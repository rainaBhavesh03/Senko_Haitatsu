package com.senkohaitatsu.senkohaitatsu.domain;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    private int id;
    private ItemType type;
    private Boolean veg;
    private String name;
    private String description;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVeg() {
        return veg;
    }

    public void setVeg(Boolean veg) {
        this.veg = veg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Enumerated(value = EnumType.STRING)    //TODO: check if this works, otherwise move all the annotations to the declaration of the variables
    public ItemType getItemType() {
        return type;
    }

    public void setItemType(ItemType type) {
        this.type = type;
    }    
}
