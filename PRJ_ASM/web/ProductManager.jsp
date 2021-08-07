<%-- 
    Document   : ProductManager
    Created on : Mar 15, 2021, 10:13:50 PM
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
    <body>
        <jsp:include page="Header.jsp"></jsp:include>

            <div class="container">
                <label>===QUẢN LÝ SẢN PHẨM===</label><br/>
                <div class="container2">
                    <label>ADD NEW PRODUCT</label>
                    <form  method="post" action="add">
                        Category Name
                        <select  name="cid"> 
                        <c:forEach items="${ListCate}" var="c">            
                            <option value="${c.category_id}"> ${c.category_name}
                            </option>  
                        </c:forEach>                
                    </select>
                    Product name  <input type="text" name="pname">      
                    Nha san xuat  <input type="text" name="manufacturer" >                   
                    Frequency <input type="number" name="frequency">     
                    Size  <input type="number" name="size">   
                    Price <input type="number" name="price" >      
                    Discount <input type="number" name="discount">      
                    URL <input type="text" name="url" >      
                    Description <textarea type="text" name="description"></textarea>  
                    Amount <input type="number" name="amount" >  
                    <button type="submit" class="btn">ADD</button>
                </form>
            </div>
            <table class="table"> 
                <tr>
                    <th>ID</th>               
                    <th>Name</th>           
                    <th>Price</th>
                    <th>Discount</th>
                    <th>Img  URL</th>                
                    <th>Description</th>
                    <th>Amount</th> 
                    <th>Image</th>
                  
                </tr>
                <c:forEach items="${ListProduct}" var="o"> 
                    <tr>${o.toTable()}
                        <td><img src="${o.img_url}" width="200px"></td>
                        <td><a href="loadproduct?pid=${o.product_id}">Edit</a></td>
                        <td><a href="delete?pid=${o.product_id}" >Delete</a></td>
                    </tr>    
                </c:forEach>
            </table>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</body>
</html>
