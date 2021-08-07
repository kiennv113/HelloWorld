<%-- 
    Document   : EditProduct
    Created on : Mar 16, 2021, 8:57:39 AM
    Author     : Kien Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>

      
           <div class="container2">
            <label>ADD NEW PRODUCT</label>
            <form method="post" action="edit">
            ProductID  <input type="text" name="pid" value="${detail.product_id}" readonly>        
          Category Name
            <select  name="cid"> 
                <c:forEach items="${ListCate}" var="c">            
                    <option value="${c.category_id}" ${detail.catalog_id==c.category_id?"selected":""}> ${c.category_name}
                    </option>  
                </c:forEach>                
            </select>
          <input type="text" name="cid" value="${detail.catalog_id}" hidden> 
          Product name  <input type="text" name="pname" value="${detail.product_name}" required>      
          Nha san xuat  <input type="text" name="manufacturer" value="${detail.manufacturer}" required >      
          Size  <input type="number" name="size" value="${detail.size}" required>      
          Frequency <input type="number" name="frequency" value="${detail.frequency}" required>      
          Price <input type="number" name="price" value="${detail.product_price}" required >      
          Discount <input type="number" name="discount" value="${detail.discount}" required>      
          URL <input type="text" name= "url" value="${detail.img_url}">
          <img src ="${detail.img_url}" width="300px" alt="image product"  >
          Description <textarea type="text" name="description" style="height: 300px"> ${detail.description} </textarea>
           Amount <input type="number" name="amount" value="${detail.amount}" required >    
          <button type="submit" class="btn">Save</button>
        </form>
        </div>           
     <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
