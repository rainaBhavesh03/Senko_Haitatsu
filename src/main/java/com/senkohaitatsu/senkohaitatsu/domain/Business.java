package com.senkohaitatsu.senkohaitatsu.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Business {
    private int id;
    private String name;
    private String tagline;
    private boolean rtto;   //ready to take orders

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTagline(){
        return tagline;
    }

    public void setTagline(String tagline){
        this.tagline = tagline;
    }
    
    public boolean getRtto(){
        return rtto;
    }

    public void setRtto(boolean rtto){
        this.rtto = rtto;
    }
}
