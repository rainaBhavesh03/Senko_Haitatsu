package com.senkohaitatsu.senkohaitatsu.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Business {
    private int id;
    private String name;
    private String address;
    private boolean rtto;   //ready to take orders

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public boolean getRtto(){
        return rtto;
    }

    public void setRtto(boolean rtto){
        this.rtto = rtto;
    }
}
