<%-- 
    Document   : Login
    Created on : 2018-10-27, 7:21:08
    Author     : Zhixiang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head>
        <base href="<%=basePath%>">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <link rel="stylesheet" type="text/css"  href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css">
        <link rel="stylesheet" type="text/css"  href="css/style.css">
    </head>
    <body>
        <!--=-------
        Navigation 
        ------------>
        <div id="nav" class="container-fluid">
            <nav class="navbar navbar-custom">
                <div class="container">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#page-top">Zhixiang Liu</a> 
                    </div>
                    <ul class="nav navbar-nav">
                        <li><a class="nav-item nav-link" href="Login.jsp">Login</a></li>
                        <li><a class="nav-item nav-link" href="register.jsp">Register</a></li>
                    </ul>
                </div>
            </nav>
        </div>
        <!--=-------
        Login
------------>
        <div id = "Login" class = "container">
            <div class = "col-md-6 login-left">
                <div class="section-title text-center center">
                    <h2>REGISTERED CUSTOMERS</h2>
                    <hr class="divider">
                    <p>If you have an account with us, please log in.</p>
                </div>
                <form form class="form-horizontal" method = "post" action = "logInServlet?type=login">
                    <div class="form-group">
                        <span class="col-sm-3 control-label">User Name<label>*</label></span>
                        <div class="col-sm-9">
                            <input id="username" class="form-control" type="text" required name="username" >
                        </div>
                    </div>
                    <div class="form-group">
                        <span class="col-sm-3 control-label">Password<label>*</label></span>
                        <div class="col-sm-9">
                            <input id="pwd" class="form-control" type="password" required name="password">
                        </div>
                    </div>
                    <%
                        String errorInfo = (String)request.getAttribute("errinfo"); 
                        if(errorInfo != null) {
                        out.println("<div class=\"col-md-9 col-md-offset-3\">");
                        out.println("<div class=\"alert alert-danger\">"+errorInfo+"</div>");
                        out.println("</div>");
                    }
                    %>
                    <div class="form-group">
                        <div class="col-md-5, col-md-offset-7">
                            <button type="reset" value="Reset" class="btn btn-default">Reset</button>
                            <button type="submit" value="Login" class="btn btn-default">Login</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-md-6 login-right">
                <div class="section-title text-center center">
                    <h2>NEW CUSTOMERS</h2>
                    <hr class="divider">
                    <p>If you are a new user to the system, please register your information.</p>
                    <button class="btn btn-primary btn-sm" ><a href="register.jsp">Create an Account</a></button>
                </div>
            </div>	
            <div class="clearfix"> </div>
        </div>
        <!------------------
        footer
     -------------------->
        <div id="footer" class="text-center container-fluid">
            <div class="section-title center">
                <h2>Contact me</h2>
                <hr class="divider">
            </div>
            <div class="col-md-6 col-md-offset-3">
                <div class="col-md-4"> <span class="glyphicon glyphicon-home"></span>
                    <p>5620 Fifth Ave<br>
                        Pittsburgh,PA,15260</p>
                </div>
                <div class="col-md-4"> <span class="glyphicon glyphicon-envelope"></span>
                    <p>zhl136@pitt.edu.cn</p>
                </div>
                <div class="col-md-4"> <span class="glyphicon glyphicon-phone glyphicon-lg"></span>
                    <p> +1 951 801 0076</p>
                </div>
                <hr>
                <div class="clearfix"></div>
            </div>
            <!------------------
            copyright
         -------------------->	
            <div class="copyright container-fluid">
                <div class="col-md-4 col-md-offset-4">
                    <p>Copyright &copy; 2018 Zhixiang Liu @pitt</p>
                </div>
            </div>
    </body>
</html>

