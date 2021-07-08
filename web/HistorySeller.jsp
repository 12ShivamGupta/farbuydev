<%@include file="block/HistorySellerHeader.jsp" %>
<%@page import=" com.sih.model.dao.SellerDao"%>
<%@page import="com.sih.model.dto.Seller"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script> 

<%  
    HttpSession Session = request.getSession();
    
    
    String phone = Session.getAttribute("no").toString();
    
    
    List<Seller> list = new SellerDao().list(phone);    

    
    
%>
<br><br><br>
<h1>  <div class="section-title text-center">
               <h3><u>History</u></h3>
         </div>
         </h1>
<hr>
<input type="search" class="light-table-filter" data-table="table-info" placeholder="Filter/Search">
<br><br>
<table id="dtbl" style="align-self: center;" class="table table-striped table-bordered">
     <thead>
    <tr class="active">
        <th>Commodity</th>
        <th>Quantity(kg's)</th>
        <th>Rate(kg's)</th>
        <th>Date Modified</th>
    </tr>
     </thead>
    
     <tbody>
    <% for(Seller ob : list) { %>
    <tr>
        <th><%=ob.getCommodity()%></th>
        <th><%=ob.getQuantity()%></th>
        <th><%=ob.getRate()%></th>
        <th><%=ob.getDate()%></th>
    </tr>
    <%}%>
     </tbody>
</table>
    <br><br><br><br><br><br><br>
    <br><br><br><br><br><br>
          <script src="<c:url value="js/jquery.js"/>"></script>
        <script src="<c:url value="js/jquery.dataTables.min.js"/>"></script>
            <script>
          $(document).ready( function(){
        	 $("#dtbl").dataTable(); 
          }
         );
        </script>
        <script src="<c:url value="js/custom.js"/>"></script>
        <script src="<c:url value="js/function.js"/>"></script>
<%@include file="block/footer.jsp" %>



