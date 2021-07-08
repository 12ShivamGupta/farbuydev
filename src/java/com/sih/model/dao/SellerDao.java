package com.sih.model.dao;

import com.sih.controller.DbConnection;
import com.sih.model.dto.Register;
import com.sih.model.dto.Seller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SellerDao 
{
   private static DbConnection connection;

    public SellerDao() 
    {
        this.connection = new DbConnection();
    }
   
   public List<Seller> list(String phone)
    {
        List<Seller> sellerlist = new ArrayList<>();
        try{
            Connection cnn = new DbConnection().getConnection();
            
            PreparedStatement stm = cnn.prepareStatement("select * from seller where phone=?");
            stm.setString(1,phone);
           
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Seller ob = new Seller(rs.getString("Landmark"),rs.getString("City"), rs.getString("commodity"),rs.getInt("quantity"),rs.getFloat("rate"), rs.getString("date"));
                sellerlist.add(ob);
            }
            
            cnn.close();
        }catch(Exception ex){}
        return sellerlist;
    }
   
    
   public static boolean save(Seller obj)
   {
        String Landmark=null;
        String City=null;
       try {
           Connection conn = connection.getConnection();
           
           PreparedStatement ps2 = conn.prepareStatement("select landmark,city from register where phone=?");
           ps2.setString(1, obj.getPhone());
           
           ResultSet rs2 = ps2.executeQuery();
           if(rs2.next())
           {
               Landmark = rs2.getString("landmark");
               City = rs2.getString("city");
           }
           
           PreparedStatement ps1 = conn.prepareStatement("select commodity from seller where commodity=? and phone=?");
           ps1.setString(1,obj.getCommodity());
           ps1.setString(2, obj.getPhone());
           
           ResultSet rs = ps1.executeQuery();
           
           if(rs.next())
           {
             PreparedStatement ps = conn.prepareStatement("update seller set landmark=?,city=?,commodity=?,quantity=?,rate=?,phone=?,date=? where commodity=? and phone=?");
           
             ps.setString(1, Landmark);
             ps.setString(2, City);
             ps.setString(3, obj.getCommodity());
             ps.setInt(4, obj.getQuantity());
             ps.setFloat(5, obj.getRate());
             ps.setString(6, obj.getPhone());
             ps.setString(7, obj.getDate());
             ps.setString(8, obj.getCommodity());
             ps.setString(9, obj.getPhone());
             
             ps.executeUpdate();
            
             conn.close();
              return true;
          }
           else
           {
             PreparedStatement ps = conn.prepareStatement("insert into seller(Landmark,City,commodity,quantity,rate,phone,date) value(?,?,?,?,?,?,?)");
           
             ps.setString(1, Landmark);
             ps.setString(2, City);
             ps.setString(3, obj.getCommodity());
             ps.setInt(4, obj.getQuantity());
             ps.setFloat(5, obj.getRate());
             ps.setString(6, obj.getPhone());
             ps.setString(7, obj.getDate());
           
             ps.executeUpdate();
             
             conn.close();
              return true;
          }     
       }catch (Exception ex) 
       {
           System.out.println("Error : "+ ex.getMessage());
           return false;
       }       
   }
   
   public List<Seller> search(Seller obj) 
   {
       List<Seller> sellerlist = new ArrayList<>();
        try{
            Connection cnn = new DbConnection().getConnection();
            
            PreparedStatement stm = cnn.prepareStatement("select phone,date,landmark,city from seller where commodity=? and quantity >=?");
            stm.setString(1, obj.getCommodity());
            stm.setInt(2, obj.getQuantity());
           
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                String date = rs.getString("date");
                String landmark = rs.getString("landmark");
                String city = rs.getString("city");
                String phone = rs.getString("phone");
                String name = null;
                String email = null;
                PreparedStatement ps = cnn.prepareStatement("select name,email from register where phone=?");
                ps.setString(1, rs.getString("phone"));
                
                ResultSet rs1 = ps.executeQuery();
                while(rs1.next())
                {
                    name = rs1.getString("name");
                    email = rs1.getString("email");
                }
                
               
                Seller ob = new Seller(name,landmark,city,email, phone,date);
                sellerlist.add(ob);
            }
                       
            cnn.close();
        }catch(Exception ex){}
        return sellerlist;
    
   }
}
