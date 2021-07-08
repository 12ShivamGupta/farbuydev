package com.sih.controller;

import com.sih.model.dao.SellerDao;
import com.sih.model.dto.Seller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SellerAvailable", urlPatterns = {"/SellerAvailable"})
public class SellerAvailable extends HttpServlet 
{
     private SellerDao sellerdao;

    public SellerAvailable() 
    {
        this.sellerdao = new SellerDao();
    }
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String city = request.getParameter("city").toUpperCase();
        String commodity = request.getParameter("comm");
        int quantity = Integer.parseInt(request.getParameter("qty"));
        
        Seller obj = new Seller(city, commodity,quantity);
        
        HttpSession session = request.getSession();
        session.setAttribute("city", city);
        session.setAttribute("commodity", commodity);
        session.setAttribute("quantity", quantity);
     
        //List<Seller> list = sellerdao.search(obj);
        
        response.sendRedirect("SellerAvaible.jsp");
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

}
