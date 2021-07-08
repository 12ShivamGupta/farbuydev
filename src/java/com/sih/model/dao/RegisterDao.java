package com.sih.model.dao;

import com.sih.controller.DbConnection;
import com.sih.model.dto.Register;
import com.sih.model.dto.Seller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

public class RegisterDao 
{
  private static DbConnection connection;

    public RegisterDao() 
    {
        this.connection = new DbConnection();
    }
   
   
   
   public static boolean save(Register obj)
   {
       try {
           Connection conn = connection.getConnection();
           
           PreparedStatement ps = conn.prepareStatement("insert into Register(name,dob,landmark,city,email,phone,password,category) value(?,?,?,?,?,?,?,?)");
           
           ps.setString(1, obj.getName());
           ps.setString(2, obj.getDob());
           ps.setString(3, obj.getLandmark());
           ps.setString(4, obj.getCity());
           ps.setString(5, obj.getEmail());
           ps.setString(6, obj.getPhone());
           ps.setString(7, obj.getPassword());
           ps.setInt(8, obj.getCategory());
           
           ps.executeUpdate();
           conn.close();
           return true;   
       }catch (Exception ex) 
       {
           System.out.println("Save donor errro : "+ ex.getMessage());
           return false;
       }       
   }
   
    public static boolean getbuyer(Register obj)
   {
       try {
           Connection conn = connection.getConnection();
           
           PreparedStatement ps = conn.prepareStatement("select * from register where phone=? and password=? and category=1");
           
           System.out.println(obj.getPhone()+" : "+obj.getPassword());
           
           ps.setString(1, obj.getPhone());
           ps.setString(2, obj.getPassword());
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next()){
               return true;
           }
           
           System.out.println(rs.getString("name"));
           
           conn.close();
           return false;   
       }catch (Exception ex) 
       {
           System.out.println("Error : "+ ex);
           return false;
       }       
   }
    
     public static boolean gettransporter(Register obj)
   {
       try {
           Connection conn = connection.getConnection();
           
           PreparedStatement ps = conn.prepareStatement("select * from Register where phone=? and password=? and category=3");
           
           ps.setString(1, obj.getPhone());
           ps.setString(2, obj.getPassword());
           
           ResultSet rs = ps.executeQuery();
           if(rs.next())
           {
              return true;
           }
           conn.close();
           return false;   
       }catch (Exception ex) 
       {
           System.out.println("Error : "+ ex.getMessage());
           return false;
       }       
   }
     
    public static boolean getseller(Register obj)
    {
       try {
           Connection conn = connection.getConnection();
           
           PreparedStatement ps = conn.prepareStatement("select * from register where phone=? and password=? and category=2");
           
           ps.setString(1, obj.getPhone());
           ps.setString(2, obj.getPassword());
           
           ResultSet rs = ps.executeQuery();
           if(rs.next())
           {
              return true;
           }
           conn.close();
           return false;   
       }catch (Exception ex) 
       {
           System.out.println("Error : "+ ex.getMessage());
           return false;
       }       
   }
    
       public List<Register> list1(String phone)
    {
        String City=null;
        List<Register> Transporterlist = new ArrayList<>();
        try{
            Connection cnn = new DbConnection().getConnection();
            
            PreparedStatement ps = cnn.prepareStatement("select City from register where phone=?");
            ps.setString(1, phone);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                City = rs.getString("City");
            }
            
            PreparedStatement stm = cnn.prepareStatement("select * from register where City=? and category=3");
            stm.setString(1, City);
            
            ResultSet rs1 = stm.executeQuery();
            
            while(rs1.next()){
                Register ob = new Register(rs1.getString("name"), rs1.getString("Landmark"),rs1.getString("City"), rs1.getString("email"), rs1.getString("phone"));
             
                Transporterlist.add(ob);
            }
            
            cnn.close();
        }catch(Exception ex){}
        return Transporterlist;
    }
   
}
