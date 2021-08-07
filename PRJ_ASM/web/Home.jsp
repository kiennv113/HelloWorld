
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
        <jsp:include page="Header.jsp"></jsp:include>        
            <!--Show Category-->      
            <div class="categories">    
                <label >Danh mục sản phẩm</label>
            <c:forEach items="${ListCate}" var="c">            
                <a href="CategoryControl?category_id=${c.category_id}">${c.category_name}</a>              
            </c:forEach>   
        </div>
        <!--Show all Product-->
        <div class="container">   
            <div class="row">             
                <c:forEach items="${ListProduct}" var="o"> 
                    <div class="col-4">
                        <img src ="${o.img_url}" alt="product image" width="300px" height="300px" alt="image product" >
                        <h4><a href="detail?product_id=${o.product_id}">${o.product_name}</a></h4>
                        <p> Size: ${o.size} inches</p>
                        <p>Frequency: ${o.frequency} Hz</p>
                        <p>Old Price: ${o.product_price}</p> 
                        <p>Sale: ${o.discount} % </p>                                            
                        <p>Status : ${o.amount==0?"Hết hàng":"Còn hàng"} </p>
                        <a class="product-btn">New Price: ${o.product_price*(100-o.discount)/100}</a>
                        <div>  
                            <c:if test="${sessionScope.a.power == 0}">
                                <a href="loadproduct?pid=${o.product_id}" class='product-btn'>Edit</a>                                   
                            </c:if>

                            <c:if test="${sessionScope.a.power == 1}">
                                <a href="cart?pid=${o.product_id}&command=addhome" class='product-btn'>Add to cart</a>   
                             
                            </c:if>    

                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
