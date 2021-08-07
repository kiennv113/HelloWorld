<%-- 
    Document   : Account
    Created on : Mar 12, 2021, 4:20:40 PM
    Author     : Kien Nguyen
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel='stylesheet' href ='css/style.css'>
          <script>
</script>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
       
      <div class="container2">
           <label>QUẢN LÝ ACCOUNT</label>
        <table class="table"> 
       <tr>
       <th>ID</th>
       <th>Username</th>
       <th>Power</th>   
       <th>Delete</th>      
       <th>Up power</th>  
       </tr>
        <c:forEach items="${Acc}" var="ac"> 
         <tr>       
             ${ac.toRow()}
             <td><a href="deleteacc?aid=${ac.user_id}">Delete</a></td>
             <td><a href="uppower?aid=${ac.user_id}">Up</td>
         </tr> 
     </c:forEach>
         
     </table>      
           <br/>
      <h3>ADMIN TABLE</h3>
      <table>
      <tr>
       <th>ID</th>
       <th>Username</th>
       <th>Power</th>   
       </tr>    
        <c:forEach items="${Admin}" var="a"> 
         <tr>       
             ${a.toRow()}
         </tr> 
        </c:forEach>
     </table>    
            </div>
              <jsp:include page="Footer.jsp"></jsp:include>
    </body>
   
</html>
