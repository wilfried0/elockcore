package com.assam.elockcore.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "elock_langue")
public class ElockLangue implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long userId;
    private String langue;
    private String elockName;
    private Boolean isVisible;

    public ElockLangue(){}
    
    public ElockLangue(long userId, String langue, String elockName, Boolean isVisible) {
        this.userId = userId;
        this.langue = langue;
        this.elockName = elockName;
        this.isVisible = isVisible;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getElockName() {
        return elockName;
    }
    public void setElockName(String elockName) {
        this.elockName = elockName;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @Override
    public String toString() {
        return "ElockLangue [elockName=" + elockName + ", id=" + id + ", langue=" + langue + ", userId=" + userId + "]";
    }
}
