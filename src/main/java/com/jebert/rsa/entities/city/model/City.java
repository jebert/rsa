package com.jebert.rsa.entities.city.model;

import java.io.Serializable;

import java.util.Objects;

import com.jebert.rsa.entities.city.helper.StateCode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    private Integer ibgeCode;
    private String name;
    private String state;

    public City() {
    }

    public City(String name, String stateAcronym, Integer ibgeCode) {
        this.name = name;
        this.ibgeCode = ibgeCode;
        this.state = StateCode.fromAcronym(stateAcronym).getAcronym();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(Integer ibgeCode) {
        this.ibgeCode = ibgeCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        City other = (City) obj;
        return Objects.equals(ibgeCode, other.ibgeCode);
    }
}
