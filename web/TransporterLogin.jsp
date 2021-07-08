<%@include file="block/registerheader.jsp" %>
<br><br><br><br><br>
<%
    String check = request.getParameter("e");
    String msg="";
    if(check!=null)
    {
        if(check.equals("true")){
            msg = "Login successfully Done !";
        }else{
            msg = "Login Failed !";
        }
    }
%>
           
           <div class="section-title text-center">
            <h3><u>Transporter Login</u></h3>
           </div><!-- end title -->
           <h1 align="center">
           <br>
           <form align="centre" action="transporterservlet" method="post">
             <label align="center">Mobile No.</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="tel" placeholder=" " name="no" required>
             <br><br><br>
             <label align="centre">Password</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="password" placeholder=" " name="pass" required>
             <br><br><br><br>
             <button align="centre" type="submit" >Login</button>
             &nbsp;&nbsp;
             <br><br>
             <b class="text-danger"><%=msg%></b>
           </form>  
      </h1>
<br><br>
<br><br>
<%@include file="block/footer.jsp" %>