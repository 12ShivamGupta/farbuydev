<%@include file="block/SellerAvailableHeader.jsp" %>
<%@page import=" com.sih.model.dao.SellerDao"%>
<%@page import="com.sih.model.dto.Seller"%>
<%@page import="java.util.List"%>
<%
    String phone = session.getAttribute("no").toString();
    
    HttpSession Session = request.getSession();
    String city = Session.getAttribute("city").toString();
    String commodity = Session.getAttribute("commodity").toString();
    String quantity = Session.getAttribute("quantity").toString();
    
   
    List<Seller> list = new SellerDao().search(new Seller(city, commodity, Integer.parseInt(quantity)));    
    
    
    response.setHeader("Cache-Control", "no-cache, no-data, must-revalidate");
    
    if(phone == null)
       response.sendRedirect("BuyerLogin.jsp");
%>
<br><br><br>
<h1>  <div class="section-title text-center">
               <h3><u>Seller Available</u></h3>
         </div>
         </h1>
<hr>
<table id="dtbl" class="display table table-hover">
     <thead>
    <tr class="active">
        <th>Name</th>
        <th>Landmark</th>
        <th>City</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Date Commodity Last Updated</th>
    </tr>
     </thead>
    
     <tbody>
    <% for(Seller ob : list) { %>
    <tr>
        <th><%=ob.getName()%></th>
        <th><%=ob.getLandmark()%></th>
        <th><%=ob.getCity()%></th>
        <th><%=ob.getEmail()%></th>
        <th><%=ob.getPhone()%></th>
        <th><%=ob.getDate()%></th>
    </tr>
    <%}%>
     </tbody>
</table>
    <br><br><br><br><br><br><br><br><br><br><br>
<%@include file="block/footer.jsp" %>