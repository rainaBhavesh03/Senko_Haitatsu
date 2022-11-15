package com.senkohaitatsu.senkohaitatsu.domain;
import javax.persistence.Entity;

@Entity
public class BusinessOwner extends User{
    // private Object b;   //then later (inside setter OR constructor) cast it to whatever type ob business they own
    // //don't know if this is allowed 'cause Business is an abstract class
    // private Business b; //then later (inside setter OR constructor) cast it to whatever type ob business they own
}
