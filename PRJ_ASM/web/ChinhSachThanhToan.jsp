<%-- 
    Document   : ChinhSachThanhToan.jsp
    Created on : Mar 9, 2021, 3:54:07 PM
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
        <div class="container">
            <div>
                <h2>THANH TOÁN CHUYỂN KHOẢN</h2>                    
                 <p> Quý khách hàng có thể thanh toán hoá đơn bằng cách chuyển khoản qua tài khoản của <br/>
                     công ty AC với các ngân hàng dưới đây và liên hệ<br/>
                     Hotline 123456 (miễn phí) để xác nhận thông tin.</p>
                 <img src="images/ck.png" width="100%">
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
