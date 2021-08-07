<%-- 
    Document   : Transaction
    Created on : Mar 17, 2021, 8:58:02 PM
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
<!--            private int transaction_id;
    private int order_id;
    private int user_id;  
    private Timestamp date;
    private String address;
    private String phone;
    private int amount;
    private String payment;
    private Boolean status;-->
        <jsp:include page="Header.jsp"></jsp:include>
        <div class="container2">
                    <form action="trans" method="post"> 
                        <div class="">
                            <span>Họ và tên</span>
                            <br>
				<div class="login-mail">
					<input type="text" placeholder="Họ và tên của người nhận hàng" name="name" required>					
				</div>
                            <span>Địa Chỉ Của Bạn * : </span>
                            <br>
				<div class="login-mail">
					<input type="text" placeholder="Tầng, số nhà, đường, phường, quận..." name="address" required>		
				</div>
                              <span>Điện thoại</span>
                            <br>
				<div class="login-mail">
					<input type="number" placeholder="Điện thoại di động của người nhận hàng" name="phone" required>					
				</div>                           
                           <div>
                                <span>Phương Thức Thanh Toán * : </span>
                                <select name="payment">
                                    <option value="Bank transfer">Chuyển khoản</option>
                                    <option value="Live">Trực tiếp</option>                                        
                                </select>
				</div>		
			</div>
			<div >
				<label>                                    
					<input type="submit" value="OK">
				</label>					
                        </div>		
			</form>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
