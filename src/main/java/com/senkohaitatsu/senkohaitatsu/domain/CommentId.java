package com.senkohaitatsu.senkohaitatsu.domain;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CommentId implements Serializable{
    private static final long serialVersionUID = -4934508126458129491L;
    private User user;
    private Business business;

    @ManyToOne
    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    @ManyToOne
    public Business getBusiness(){
        return business;
    }

    public void setBusiness(Business business){
        this.business = business;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
