package com.sih.model.dto;

public class Buyer 
{
    private int bid;
    private String commodity;
    private int Quantity;
    private String phone;
    
    public Buyer() {
    }

    public Buyer(String commodity, int Quantity, String phone) {
        this.commodity = commodity;
        this.Quantity = Quantity;
        this.phone = phone;
    }

    public Buyer(int bid, String commodity, int Quantity) {
        this.bid = bid;
        this.commodity = commodity;
        this.Quantity = Quantity;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Override
    public String toString() {
        return "Buyer{" + "bid=" + bid + ", commodity=" + commodity + ", Quantity=" + Quantity + '}';
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    
    
}
