<%-- 
    Document   : ChangePassword
    Created on : Mar 16, 2021, 6:56:06 PM
    Author     : Kien Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        
        <div class="container2">
            <form method="post" action="changepass?uid=${sessionScope.a.user_id}">
             <p>${mess}</p>
            <label>Hello, ${sessionScope.a.username} ! </label>  <br/>   
            <label>Old Password </label> <input type="text" name="oldpass" required>
            <label>New Password </label> <input type="text" name="newpass" required>
            <label>Retype Password </label> <input type="text" name="rep" required>   
            <button type="submit" class="btn"> OK </button>
            </form>
        </div> 
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
