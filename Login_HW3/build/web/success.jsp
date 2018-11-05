<%-- 
    Document   : success
    Created on : 2018-10-27, 21:02:15
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
        <title>Welcome</title>
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
        Welcome
------------>
        <div id = "welcome" class = "container">
            <div class = "col-md-8 col-md-offset-2">
                <div class="section-title text-center center">
                    <form class="form-horizontal" method = "post" action = "logInServlet?type=logout">
                        <h2>Welcome,${username }</h2>
                        <button type="submit" value="Submit" class="btn btn-default">Logout</button>
                    </form>
                </div>	
                <div class="clearfix"> </div>
            </div>
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





