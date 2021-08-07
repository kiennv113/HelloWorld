
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href ='css/style.css'>
    </head>
    <body>
      
            <div class="account-page">
                <div class="container">
                    <div class="row">

                        <div class="col-2">
                            <div class="form-container">
                                <div class="form-btn">   
                                    <span>Register</span>
                                </div>
                                <form id="RegForm" action="signup" method="post">
                                    <p>${mess}</p>
                                    <input type="text" placeholder="Username" name="user" required>                                   
                                    <input type="password" placeholder="Password" name="pass" required >
                                    <input type="password" placeholder="Re-type password" name="repass" required>
                                    <button type="submit" class="btn">Register</button>
                                    <a href="Login.jsp">Sign in</a>
                                     <a href="Home">Sign in by Guest</a>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

    </body>
</html>
