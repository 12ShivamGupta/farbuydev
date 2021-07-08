package com.sih.model.dto;

public class Seller 
{
    private int sid;
    private String landmark;
    private String city;
    private String commodity;
    private int quantity;
    private float rate;
    private String phone;
    private String date;
    private String name;
    private String email;

    public Seller() {
    }

    public Seller(int sid, String landmark, String city, String commodity, int quantity, float rate, String phone, String date) {
        this.sid = sid;
        this.landmark = landmark;
        this.city = city;
        this.commodity = commodity;
        this.quantity = quantity;
        this.rate = rate;
        this.phone = phone;
        this.date = date;
    }

     public Seller(String landmark, String city, String commodity, int quantity, float rate, String phone, String date) {
        this.landmark = landmark;
        this.city = city;
        this.commodity = commodity;
        this.quantity = quantity;
        this.rate = rate;
        this.phone = phone;
        this.date = date;
    }


     public Seller(String landmark,String city, String commodity, int quantity, float rate,String date) {
        this.landmark = landmark;
        this.city = city;
        this.commodity = commodity;
        this.quantity = quantity;
        this.rate = rate;
        this.date = date;
    }

    public Seller(String city, String commodity, int quantity) {
        this.city = city;
        this.commodity = commodity;
        this.quantity = quantity;
    }
 
    public Seller(String name,String landmark,String city,String email,String phone,String date) {
        this.name = name;
        this.landmark = landmark;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }
    
     public Seller(String commodity, int quantity, float rate,String phone,String date) {
        this.commodity = commodity;
        this.quantity = quantity;
        this.rate = rate;
        this.phone = phone;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Seller{" + "sid=" + sid + ", landmark=" + landmark + ", city=" + city + ", commodity=" + commodity + ", quantity=" + quantity + ", rate=" + rate + ", phone=" + phone + ", date=" + date + '}';
    }
}
