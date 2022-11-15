package com.senkohaitatsu.senkohaitatsu.domain;
import javax.persistence.Entity;

@Entity
public class Customer extends User{
    //TODO: only if they have an Account, should they get to be able to use OrderCart, FavList, PrevOrder, PaymentHistory, etc  
}
