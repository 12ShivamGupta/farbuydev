<%@include file="block/HistorySellerHeader.jsp" %>
<%@page import=" com.sih.model.dao.RegisterDao"%>
<%@page import="com.sih.model.dto.Register"%>
<%@page import="java.util.List"%>
<%
      
    HttpSession Session = request.getSession();
      String phone = Session.getAttribute("no").toString();
    
    
      List<Register> list = new RegisterDao().list1(phone);    

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
<br><br><br>
<h1>  <div class="section-title text-center">
               <h3><u>Available Transporter</u></h3>
         </div>
         </h1>
<hr>
<table id="dtbl" class="display table table-hover">
     <thead>
    <tr class="active">
        <th>Firm Name</th>
        <th>Landmark</th>
        <th>City</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>
     </thead>
    
     <tbody>
    <% for(Register ob : list) { %>
    <tr>
        <th><%=ob.getName()%></th>
        <th><%=ob.getLandmark()%></th>
        <th><%=ob.getCity()%></th>
        <th><%=ob.getEmail()%></th>
        <th><%=ob.getPhone()%></th>>
    </tr>
    <%}%>
     </tbody>
</table>
     <br><br><br><br><br><br><br><br><br><br><br><br>
     
     <script>
         function opendlg(){
             $("#myModal").modal('show');
         }
         </script>
    
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
  <form action='request' method="post">
    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
                  <h4>Request</h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4></h4>
      </div>
      <div class="modal-body">
        
              <input type="hidden" name="donor" id="dcomp">
              <input type="text" name="text" class='form-control' placeholder="Enter Message" required><br><br>
      </div>
      <div class="modal-footer">
         <button type="submit" >Send</button>
        <button type="button"  data-dismiss="modal">Close</button>
      </div>
    </div>
</form>
  </div>
</div>    
    
<%@include file="block/footer.jsp" %>



