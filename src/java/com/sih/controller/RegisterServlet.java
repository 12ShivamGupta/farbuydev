package com.sih.controller;

import com.sih.model.dao.RegisterDao;
import com.sih.model.dto.Register;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet 
{
    private RegisterDao registerdao;

    public RegisterServlet() 
    {
        this.registerdao = new RegisterDao();
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String  name = request.getParameter("uname");
        String  dob = request.getParameter("dob");
        String  landmark = request.getParameter("landmark");
        String  city = request.getParameter("city").toUpperCase();
        String  email = request.getParameter("email");
        String  phone = request.getParameter("no");
        String  password = request.getParameter("pass");
        int category = Integer.parseInt(request.getParameter("group"));
        
        HttpSession session = request.getSession();
        session.setAttribute("landmark", landmark);
        session.setAttribute("city", city);
        
        
        
        Register obj = new Register(name, dob, landmark,city, email, phone,password, category);
        
        boolean check = RegisterDao.save(obj);
        
     response.sendRedirect("register.jsp?e="+check);
    
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
