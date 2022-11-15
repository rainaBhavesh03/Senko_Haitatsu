package com.senkohaitatsu.senkohaitatsu.domain.identification;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PanCard {
    private String id;  //10 character long and alphanumeric
    private String holderName;
    // private Date dob;   //date of birth

    //TODO: check how to include parameters to digital data like photograph

    private String fatherName;

    @Id @Column(length = 10)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    

}
