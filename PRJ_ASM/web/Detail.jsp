
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Detail</title>
        <link rel='stylesheet' href ='css/style.css'>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>     
            <div class="categories">                  
                <label> CATEGORY </label>
            <c:forEach items="${ListCate}" var="c">            
                <a href="CategoryControl?category_id=${c.category_id}">${c.category_name}</a>
            </c:forEach>   
        </div>
        <div class="container">    
            <div class="row">                     
                <div class="container2">
                    <img src ="${detail.img_url}" width="300px"  alt="image product" >
                    <h4>${detail.product_name}</h4> <br/>                                                      
                    <table style="border: 1px solid black">
                    <tr> <td>Manufacturer </td> 
                        <td>${detail.manufacturer}</td>
                    </tr>
                    <tr>
                        <td>Size   
                       <td> ${detail.size} inches</td>
                    </tr>
                    <tr>
                        <td> Frequency </td>
                      <td>  ${detail.frequency} Hz</td>
                    </tr>
                    <tr>
                      <td>  Discount </td>
                          <td>${detail.discount}%</tf>
                    </tr>                       
                    
                    <tr>
                        <td>Description </td>
                        <td> ${detail.description}</td>
                    </tr>
                    </table>
                    <p class="btn">New Price:  ${detail.product_price*(100-detail.discount)/100}</p>                
                    <a href="#" class="btn">Add to cart</a>                 
                </div>
            </div>
        </div>
                    
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
                          <a class="product-btn">New Price: ${o.product_price*(100-o.discount)/100}</a>                       
                        <div>  
                         <c:if test="${sessionScope.a.power == 0}">
                        <a href="loadproduct?pid=${o.product_id}" class='product-btn'>Edit</a>                                   
                         </c:if>
                        
                          <c:if test="${sessionScope.a.power == 1}">
                        <a href="#" class='product-btn'>Add to cart</a>                                    
                         </c:if>                                     
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
