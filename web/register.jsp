<%@include file="block/registerheader.jsp" %>
<br>
<%
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
%>

<section id="meet-team">
    <div class="container"><br><br>
                <div class="section-title text-center">
               <h3><u>Register</u></h3>
         </div>
         
            
                   <div class="row">
     <div class="col-lg-1 col-md-1 col-sm-1"></div>
     <div class="col-lg-10 col-md-10 col-sm-10">
         <form action="register" method="post">
             <label>Your Name</label>
             <input class="form-control" type="text" placeholder="Your Name" name="uname" required>
             <br>
             <label>Your DOB</label>
             <input class="form-control" type="date" placeholder="Your DOB" name="dob" required>
             <br>
             <label>Your Landmark</label>
             <input class="form-control" type="text" placeholder="Your Landmark" name="landmark" required>
             <br>
             <label>Your City</label>
             <input class="form-control" type="text" placeholder="Your City" name="city" required>
             <br>
             <label>Your Email</label>
             <input class="form-control" type="email" placeholder="Your Email" name="email">
             <br>
             <label>Your Mobile No.</label>
             <input class="form-control" type="tel" placeholder="Your Mobile No." name="no" required>
             <br>
             <label>Your Password</label>
             <input class="form-control" type="password" placeholder="Your password" name="pass" required>
             <br>
             <label>Category</label>
             <select class="form-control" name="group">
                 <option value="1">Buyer</option>
                 <option value="2">Seller</option>
                 <option value="3">Transporter</option>
             </select>
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