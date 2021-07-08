package com.sih.controller;

import javax.mail.MessagingException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



@WebServlet(name = "contact", urlPatterns = {"/contact"})
public class contact extends HttpServlet 
{
    public static String mail;
    public static String text;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        mail = request.getParameter("mail");
        text = request.getParameter("message");
        
        boolean chk = sendEmail();
         
        response.sendRedirect("index.jsp?e="+chk);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public static boolean sendEmail() {
        
         Properties properties = new Properties();

         properties.put("mail.smtp.starttls.enable", "true");
         properties.put("mail.smtp.auth", "true");
         properties.put("mail.smtp.host", "smtp.gmail.com");
         properties.put("mail.smtp.socketFactory.port","465");
         properties.put("mail.smtp.port", "587");
           
         Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication("abc@gmail.com","abc");
            }
         });

       try 
      { 
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress("abc@gmail.com"));
         message.setRecipient(Message.RecipientType.TO, new InternetAddress("mno@gmail.com"));
         message.setSubject("To FARMNEST Team");
         message.setText(text+"/n Email : "+mail);

         Transport.send(message);
         System.out.println("Email sent successfully...");
         return true;
      } catch (Exception e) {
         System.out.println("Mail Exception : " + e.toString());
      }
       return false;
    }
    
}

