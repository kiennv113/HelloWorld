<%-- 
    Document   : CartRespond
    Created on : Mar 17, 2021, 10:41:16 AM
    Author     : Kien Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <form method="post" action="contactrep">
            <div class="container2">
            Contact id: <input  type="text" name="cid" value="${con.contact_id}" readonly>
             User id <input  type="text" name="uid" value="${con.user_id}" readonly>
            contact_topic:<input  type="text" name="topic" value="${con.contact_topic}" readonly>
            content: <input  type="text" name="content" value="${con.content}" readonly>
            date: <input  type="text" name="date" value="${con.date}" readonly>
            status: <input type="text" name="stt" value="${con.status}" readonly>
            respond: <textarea  type="text" name="respond"></textarea>
            <button type="submit"> Save</button>    
           </div>
        </form>
        </div>        
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
