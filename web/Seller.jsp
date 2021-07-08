<%@include file="block/SellerHeader.jsp" %>
<br>
<%
    HttpSession Session = request.getSession();
     
     String phone = Session.getAttribute("no").toString();
    
    String check = request.getParameter("e");
    String msg="";
    if(check!=null)
    {
        if(check.equals("true")){
            msg = "Record Successfully Updated !";
        }else{
            msg = "Updation Failed !";
        }
    }
    
   

%>

<section id="meet-team">
            <div class="container">
                <div class="section-header">
                    
                    <br><br>
                      <div class="section-title text-center">
               <h3><u>Commodity Register</u></h3>
         </div>
         
                   <div class="row">
     <div class="col-lg-1 col-md-1 col-sm-1"></div>
     <div class="col-lg-10 col-md-10 col-sm-10">
         <form action="sellersave" method="post">
             <label>Commodity</label>
             <input class="form-control" type="text" placeholder="Enter Commodity" name="comm" required>
             <br>
             <label>Quantity(in Kg's)</label>
             <input class="form-control" type="int" placeholder="Enter Quantity(in Kg's)" name="qty" required>
             <br>
             <label>Rate (per kg)</label>
             <input class="form-control" type="float" placeholder="Enter Rate (per kg)" name="price" required>
             <br>
             <label>Current Date</label>
             <input class="form-control" type="date" placeholder="Enter Current Date" name="date" required>
             <br>
             <button type="submit" class="btn-custom">SAVE</button> 
             &nbsp;&nbsp;
             
             <b class="text-danger"><%=msg%></b>
         </form>
     </div>
     <div class="col-lg-1 col-md-1 col-sm-1"></div>
 </div>
                    
                    
                </div>
            </div>
</section>
<%@include file="block/footer.jsp" %>