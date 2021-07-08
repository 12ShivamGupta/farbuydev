package com.sih.controller;

import com.sih.model.dao.RegisterDao;
import com.sih.model.dto.Register;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Buyer", urlPatterns = {"/buyerservlet"})
public class Buyerservlet extends HttpServlet 
{
    private RegisterDao registerdao;

    public Buyerservlet() 
    {
        this.registerdao = new RegisterDao();
    }
   
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String  phone = request.getParameter("no");
        String  password = request.getParameter("pass");
        
        Register obj = new Register(phone, password, 1);
        
        boolean check = RegisterDao.getbuyer(obj);
        
        String str = request.getParameter("no");
        
        HttpSession session = request.getSession();
        session.setAttribute("no", str);
        
        if(check)
        {
          response.sendRedirect("Buyer.jsp");
        }
        else
        {
          response.sendRedirect("BuyerLogin.jsp?e="+check);
        }
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
