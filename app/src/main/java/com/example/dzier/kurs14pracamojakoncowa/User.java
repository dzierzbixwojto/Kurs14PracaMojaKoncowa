package com.example.dzier.kurs14pracamojakoncowa;

/**
 * Created by dzier on 01.10.2016.
 */

public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getIsRented() {
        return isRented;
    }

    public void setIsRented(String isRented) {
        this.isRented = isRented;
    }

    private String name;
    private String password;
    private Integer telephone;
    private String isRented;

    public User(String name, String password, Integer telephone, String isRented){
        this.name=name;
        this.password=password;
        this.telephone=telephone;
        this.isRented=isRented;
    }

}
