package com.senkohaitatsu.senkohaitatsu.domain;
import java.util.Vector;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")  //allows us to change the name of the table which otherwise will be the same as the class
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private Vector<String> address;
    private int mobileNo;
    private String emailId;
    private int age;

    private Vector<Object> verifyDoc = new Vector<Object>();

    // private Date dob;    //date of birth
    private Boolean male;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    //TODO: check if using @Digits(integer = <>) is better here
    @Column(length = 10)    //TODO: check if this will restrict the size of the int type variable
    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    //TODO: check how to put restrictions for this variable
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    //TODO: check how to put restrictions for this variable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Vector<Object> getVerifyDoc() {
        return verifyDoc;
    }

    public void setVerifyDoc(){

    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public Vector<String> getAddress() {
        return address;
    }

    public void setAddress(Vector<String> address) {
        this.address = address;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
