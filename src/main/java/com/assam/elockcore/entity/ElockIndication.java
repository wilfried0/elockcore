package com.assam.elockcore.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "elock_indication")
public class ElockIndication implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long userId;
    private EType type;
    private String problemToTreat;
    private String description;
    private Boolean isVisible;
    
    public ElockIndication(long userId, EType type, String problemToTreat, String description, Boolean isVisible) {
        this.userId = userId;
        this.type = type;
        this.problemToTreat = problemToTreat;
        this.description = description;
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

    public EType getType() {
        return type;
    }
    public void setType(EType type) {
        this.type = type;
    }

    public String getProblemToTreat() {
        return problemToTreat;
    }
    public void setProblemToTreat(String problemToTreat) {
        this.problemToTreat = problemToTreat;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @Override
    public String toString() {
        return "ElockIndication [description=" + description + ", id=" + id + ", isVisible=" + isVisible
                + ", problemToTreat=" + problemToTreat + ", type=" + type + ", userId=" + userId + "]";
    }

    
}
