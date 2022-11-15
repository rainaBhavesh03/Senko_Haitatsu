package com.senkohaitatsu.senkohaitatsu.domain.identification;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhaar {
    private int id; //12 digit number
    private String holderName;
    private String address;
    // private Date dob;    //date of birth
    private int mobileNo;
    private String careOf;  //Father or husband name
    //TODO: check how to include parameters to digital data like fingerprint scans


    //TODO: check if using @Digits(integer = <>) is better here
    @Column(length = 10)    //TODO: check if this will restrict the size of the int type variable
    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    //TODO: check the difference between IDENTITY and AUTO
    @Id @Column(length = 12)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getholderName() {
        return holderName;
    }

    public void setholderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCareOf() {
        return careOf;
    }

    public void setCareOf(String careOf) {
        this.careOf = careOf;
    }

}
