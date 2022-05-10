package com.assam.elockcore.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "elock")
public class Elock implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long elockLangueId;
    private long elockIndicationId;
    private long elockContreIndicationId;
    private Boolean isVisible;
    private String imageUrl;

    public Elock(long elockLangueId, long elockIndicationId, long elockContreIndicationId,
            Boolean isVisible, String imageUrl) {
        this.elockLangueId = elockLangueId;
        this.elockIndicationId = elockIndicationId;
        this.elockContreIndicationId = elockContreIndicationId;
        this.isVisible = isVisible;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getElockLangueId() {
        return elockLangueId;
    }
    public void setElockLangueId(long elockLangueId) {
        this.elockLangueId = elockLangueId;
    }

    public long getElockIndicationId() {
        return elockIndicationId;
    }
    public void setElockIndicationId(long elockIndicationId) {
        this.elockIndicationId = elockIndicationId;
    }

    public long getElockContreIndicationId() {
        return elockContreIndicationId;
    }
    public void setElockContreIndicationId(long elockContreIndicationId) {
        this.elockContreIndicationId = elockContreIndicationId;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ElockLangue [elockContreIndicationId=" + elockContreIndicationId + ", elockIndicationId="
                + elockIndicationId + ", elockLangueId=" + elockLangueId + ", id=" + id + ", imageUrl=" + imageUrl
                + ", isVisible=" + isVisible + "]";
    }
}
