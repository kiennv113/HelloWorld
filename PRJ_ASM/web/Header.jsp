
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Page</title>
        <link rel='stylesheet' href ='css/style.css'>


    </head>
    <body>
        <div class="header fix">
            <div class="container">
                <div class="navbar">
                    <div>
                        <a href="Home"><img src="images/logo.jpg" width="125px"></a>
                    </div>


                    <div class="navbar  ">
                        <form class="search-form" method="post" action="search">     

                            <input  type="text" name="txt" placeholder="Nhập mã/tên sản phẩm" value=${searchTxt}>                                                
                            <!--     <select class="select-search-category">                                                          
                                <option value="1">Tên </option>                     
                                <option value="2">Kích thước màn hình</option>                    
                                <option value="3">Độ phân giải</option>                     
                                <option value="4">Hãng sản xuất</option>                                                                     
                            </select>-->
                            <button type="submit" name="submit" class="sub"><img src="images/search-bg.png"> </button> 

                        </form>
                    </div>
                    <c:if test="${sessionScope.a != null}">
                        <p> Hello, ${sessionScope.a.username} ! </p>
                        <a href="logout"><img src="images/user.png" class="img_header">Log out</a>                      
                        </c:if>

                    <c:if test="${sessionScope.a == null}">
                        <a href="Login.jsp"><img src="images/user.png"class="img_header">Login</a>                          
                        </c:if>  
                </div>
            </div> 

            <div class="container ">

                
                <c:if test="${sessionScope.a.power == 0}">
                    <div class="menu">
                    <a  href="Home">Trang chủ </a>
                    <a href="account">Quản lý Account</a>                
                    <a href="product">Quản lý Sản Phẩm</a>  
                    <a href="transcontrol">Quản lý Đơn hàng</a>  
                    <a href="contact">Quản lý Contact</a>  
                    <a href="ChangePassword.jsp"><img src="images/user.png"class="img_header">Change Password</a> 
                    </div>
                </c:if>                            
                <c:if test="${sessionScope.a.power == 1}">  
                    <div class="menu">
                    <a href="Home">Trang chủ </a>
                    <a href='Introduction.jsp'>Giới thiệu </a> 
                    <a href="ChinhSachThanhToan.jsp">Thanh Toán</a>                            
                    <a href="Contact.jsp">Hỏi đáp</a>                         
                    <a href="Cart.jsp"><img src="images/cart_1.png" class="img_header">Giỏ hàng</a>                       
                    <a href="ChangePassword.jsp"><img src="images/user.png"class="img_header">Change Password</a> 
                    </div>
                </c:if>

            </div>
        </div>
    </body>
</html>
