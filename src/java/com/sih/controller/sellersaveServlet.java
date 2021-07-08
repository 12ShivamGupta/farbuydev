package com.sih.controller;

import com.sih.model.dao.RegisterDao;
import com.sih.model.dao.SellerDao;
import com.sih.model.dto.Register;
import com.sih.model.dto.Seller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "sellersaveServlet", urlPatterns = {"/sellersave"})
public class sellersaveServlet extends HttpServlet
{
    private SellerDao sellerdao;

    public sellersaveServlet() 
    {
        this.sellerdao = new SellerDao();
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         HttpSession Session = request.getSession();
         String phone = Session.getAttribute("no").toString();
    
         
     //   String landmark = Session.getAttribute("landmark").toString();
      //  String city = Session.getAttribute("city").toString();
 
        String  commodity = request.getParameter("comm");
        int  quantity = Integer.parseInt(request.getParameter("qty"));
        float  rate = Float.parseFloat(request.getParameter("price"));
        String  date = request.getParameter("date");
    
        Seller obj = new Seller(commodity, quantity, rate, phone, date);
                
        
        boolean check = SellerDao.save(obj);
        
        
        
     response.sendRedirect("Seller.jsp?e="+check);
    
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
