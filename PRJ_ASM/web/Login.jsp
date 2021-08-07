<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel='stylesheet' href ='css/style.css'>
    </head>
    <!-- ------------Account-page------------------- -->
        <div class="account-page">
            <div class="container">
                <div class="row">
                    <div class="col-2">
                        <div class="form-container">
                            <div class="form-btn">   
                                <span>Login</span>
                            </div>
                            <form id="RegForm" action="login" method="post">
                                <p>${mess}</p>
                                <input type="text" placeholder="Username" name="user" required>                            
                                <input type="password" placeholder="Password" name="pass" required>
                                <button type="submit" class="btn">Login</button>
                                <a href="Register.jsp"> Sign up </a>
                                   <a href="Home">Sign in by Guest</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</html>
