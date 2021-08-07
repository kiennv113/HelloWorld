<%-- 
    Document   : TransManager
    Created on : Mar 18, 2021, 2:21:27 AM
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
         <style>
             td{
                 border: 1px solid black;
             }
         </style>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <h3>QUẢN LÝ ĐƠN HÀNG</h3>
            <table class="container2"> 
                <tr>
                    <th>transaction_id</th>
                    <th>order_id</th>
                    <th>user_id</th>
                    <th>date</th>
                    <th>address</th>
                    <th>phone</th>
                    <th>amount </th>
                    <th>payment</th>
                    <th>status</th>
                </tr>
            <c:forEach items="${listT}" var="t">
             <tr>
                 <td>${t.transaction_id}</td>
                 <td>${t.order_id}</td>
                 <td>${t.user_id}</td>
                 <td>${t.date}</td>
                 <td>${t.address}</td>
                 <td>${t.phone}</td>
                 <td>${t.amount}</td>
                 <td>${t.payment==0?"Tiền mặt":"Chuyển khoản"}</td>
                 <td>${t.status}</td>
              </tr>
            </c:forEach>
        </table>
          
        <jsp:include page="Footer.jsp"></jsp:include>

    </body>
</html>
