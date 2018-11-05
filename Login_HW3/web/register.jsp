<%-- 
    Document   : register
    Created on : 2018-10-27, 20:28:30
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
        <title>Register</title>
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
        Register
------------>
        <div id = "register" class = "container">
            <div class = "col-md-8 col-md-offset-2">
                <div class="section-title text-center center">
                    <form class="form-horizontal" role="form" method = "post" action = "logInServlet?type=register">
                        <h2>USER INFORMATION</h2>
                        <hr class="divider">
                        <div class="form-group">
                            <span class="col-sm-4 control-label">User Name<label>*</label></span>
                            <div class="col-sm-8">
                                <input class="form-control" type="text" required name="username" >
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-sm-4 control-label">Password<label>*</label></span>
                            <div class="col-sm-8">
                                <input class="form-control" type="password" required name="password1" >
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-sm-4 control-label">Confirm Password<label>*</label></span>
                            <div class="col-sm-8">
                                <input class="form-control" type="password" required name="password2" >
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-sm-4 control-label">Email Address</span>
                            <div class="col-sm-8">
                                <input class="form-control" type="text" name="email">
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-sm-4 control-label">Telephone Number</span>
                            <div class="col-sm-8">
                                <input class="form-control" type="text" name="tel">
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
                        <div class="clearfix"> </div>
                        <div class="form-group">
                            <div class="col-md-5, col-md-offset-7">
                                <button type="reset" value="Reset" class="btn btn-default">Reset</button>
                                <button type="submit" value="Submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
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



