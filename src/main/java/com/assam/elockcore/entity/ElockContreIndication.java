package com.assam.elockcore.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "elock_contre_indication")
public class ElockContreIndication implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long userId;
    private EType type;
    private String problemCaused;
    private String description;
    private Boolean isVisible;
    
    public ElockContreIndication(long userId, EType type, String problemCaused, String description, Boolean isVisible) {
        this.userId = userId;
        this.type = type;
        this.problemCaused = problemCaused;
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

    public String getProblemCaused() {
        return problemCaused;
    }
    public void setProblemCaused(String problemCaused) {
        this.problemCaused = problemCaused;
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
        return "ElockContreIndication [description=" + description + ", id=" + id + ", isVisible=" + isVisible
                + ", problemCaused=" + problemCaused + ", type=" + type + ", userId=" + userId + "]";
    }

    
}
