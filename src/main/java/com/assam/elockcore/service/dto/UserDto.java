package com.assam.elockcore.service.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private String country;
    private String town;
    private String avatar;
    private String phone;
    private String email;
    @JsonIgnore
    private String password;
    private List<String> roles;
    private String profession;
    private Boolean visible;
    private String piece;
    
    public UserDto(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "UserDto [avatar=" + avatar + ", country=" + country + ", email=" + email + ", firstName=" + firstName
                + ", id=" + id + ", lastName=" + lastName + ", password=" + password + ", phone=" + phone + ", piece="
                + piece + ", profession=" + profession + ", roles=" + roles + ", town=" + town + ", visible=" + visible
                + "]";
    }

    
}
