package com.sih.model.dao;

import com.sih.controller.DbConnection;
import com.sih.model.dto.Buyer;
import com.sih.model.dto.Seller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BuyerDao 
{
     private static DbConnection connection;

    public BuyerDao() 
    {
        this.connection = new DbConnection();
    }
   
   public List<Buyer> list(String phone)
    {
        List<Buyer> buyerlist = new ArrayList<>();
        try{
            Connection cnn = new DbConnection().getConnection();
            
            PreparedStatement stm = cnn.prepareStatement("select * from buyer where phone=?");
            stm.setString(1,phone);
           
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Buyer ob = new Buyer(rs.getInt("bid"),rs.getString("commodity"),rs.getInt("quantity"));
                buyerlist.add(ob);
            }
            
            cnn.close();
        }catch(Exception ex){}
        return buyerlist;
    }
   
     public static boolean save(Buyer obj)
   {
       try {
           Connection conn = connection.getConnection();
           
           PreparedStatement ps = conn.prepareStatement("insert into Buyer(commodity,quantity,phone) value(?,?,?)");
           
           ps.setString(1, obj.getCommodity());
           ps.setInt(2, obj.getQuantity());
           ps.setString(3, obj.getPhone());
           
           ps.executeUpdate();
           conn.close();
           return true;   
       }catch (Exception ex) 
       {
           System.out.println("Error : "+ ex.getMessage());
           return false;
       }       
   }
  
  
}
