<%-- 
    Document   : Contact
    Created on : Mar 11, 2021, 1:22:39 PM
    Author     : Kien Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel='stylesheet' href ='css/style.css'>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        
        <div class="container" >         
            <table>
                
            </table>
        </div>           
            <div class="container2">
                <form action="addcontact?uid=${a.user_id}" method="post">
                    <div class="row">         
                        <div class="col-25">
                            <label>Topic</label>
                        </div>                      
                       <div class="col-75">
                           <input name="topic" type="text" placeholder="Topic" required>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label >Góp ý</label>
                        </div>
                        <div class="col-75">
                            <textarea name="content" id="subject" name="subject" placeholder="Viết gì đó..." 
                                      style="height:200px" required></textarea>
                        </div>
                    </div>                  
                    <button class='btn2' type="submit">  Send   </button>             
                </form>
                <a class="btn2" href="#"> show contact đã gửi</a>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
