package com.sih.model.dto;

public class Register 
{
    private int rid;
    private String name;
    private String dob;
    private String landmark;
    private String city;
    private String email;
    private String phone;
    private String password;
    private int category;

    public Register() {
    }

    public Register(int rid, String name, String dob, String landmark, String city, String email, String phone, String password, int category) {
        this.rid = rid;
        this.name = name;
        this.dob = dob;
        this.landmark = landmark;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.category = category;
    }

    
    public Register(String name, String dob, String landmark, String city, String email, String phone, String password, int category) {
        this.name = name;
        this.dob = dob;
        this.landmark = landmark;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.category = category;
    }
    
    
    public Register(String phone, String password, int category) {
        this.phone = phone;
        this.password = password;
        this.category = category;
    }
 
     public Register(String name,String landmark,String city, String email, String phone) {
        this.name = name;
        this.landmark = landmark;
        this.city = city;
        this.email = email;
        this.phone = phone;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Register{" + "rid=" + rid + ", name=" + name + ", dob=" + dob + ", landmark=" + landmark + ", city=" + city + ", email=" + email + ", phone=" + phone + ", password=" + password + ", category=" + category + '}';
    }

    
}
