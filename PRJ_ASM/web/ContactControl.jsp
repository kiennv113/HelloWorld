<%-- 
    Document   : ContactControl
    Created on : Mar 16, 2021, 3:36:06 PM
    Author     : Kien Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            td {
                border:1px solid black;
            }
        </style>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        <div class="container2">
            <div class="row2">
        <table>
            <tr>
                <th>Contact ID</th>
                 <th>User ID</th>
                <th>Contact topic</th>              
                <th>Content</th>
                <th>Date</th>
                <th>Status</th>
                <th>Answer</th>
                <th>Admin Id</th>
            </tr>
        <c:forEach items="${listCon}" var="c">
            <tr> ${c.toTable()}
                <td><a href="repcon?conid=${c.contact_id}">Respond</a></td>
            </tr>
            </c:forEach>
        </table>
                </div>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
