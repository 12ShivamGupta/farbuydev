<%@page import="java.util.List"%>
<%@page import="com.sih.model.dto.Seller"%>
<%@include file="block/BuyerHeader.jsp" %>
<br>
<%
    String phone = session.getAttribute("no").toString();
    
    String check = request.getParameter("e");
    String msg="";
    if(check!=null)
    {
        if(check.equals("true")){
            msg = "Registeration successfully Done !";
        }else{
            msg = "Registeration Failed !";
        }
    }
    
    response.setHeader("Cache-Control", "no-cache, no-data, must-revalidate");
    
    if(phone == null)
       response.sendRedirect("BuyerLogin.jsp");
%>

<section id="meet-team">
            <div class="container">
                <div class="section-header">
                      <br><br>
                      <div class="section-title text-center">
               <h3><u>Search</u></h3>
         </div>
                   <div class="row">
     <div class="col-lg-1 col-md-1 col-sm-1"></div>
     <div class="col-lg-10 col-md-10 col-sm-10">
         <form action="SellerAvailable" method="post">
             <label>Landmark</label>
             <input class="form-control" type="text" placeholder="Enter Landmark" name="landmark" required>
             <br>
             <label>City</label>
             <input class="form-control" type="text" placeholder="Enter City" name="city" required>
             <br>
              <label>Commodity</label>
              <input class="form-control" type="text" placeholder="Enter Commodity" name="comm" required>
             <br>
             <label>Quantity(in Kg's)</label>
             <input class="form-control" type="int" placeholder="Enter Quantity(in Kg's)" name="qty" required>
             <br>
             <button type="submit" class="btn-custom">Search</button> 
             &nbsp;&nbsp;
             
             <b class="text-danger"><%=msg%></b>
         </form>
     </div>
     <div class="col-lg-1 col-md-1 col-sm-1"></div>
 </div>
                    
         <br>
                </div>
            </div>
</section>
<%@include file="block/footer.jsp" %>