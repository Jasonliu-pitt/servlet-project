package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--=-------\n");
      out.write("        Navigation \n");
      out.write("        ------------>\n");
      out.write("        <div id=\"nav\" class=\"container-fluid\">\n");
      out.write("            <nav class=\"navbar navbar-custom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#page-top\">Zhixiang Liu</a> \n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a class=\"nav-item nav-link\" href=\"Login.jsp\">Login</a></li>\n");
      out.write("                        <li><a class=\"nav-item nav-link\" href=\"register.jsp\">Register</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!--=-------\n");
      out.write("        Register\n");
      out.write("------------>\n");
      out.write("        <div id = \"register\" class = \"container\">\n");
      out.write("            <div class = \"col-md-8 col-md-offset-2\">\n");
      out.write("                <div class=\"section-title text-center center\">\n");
      out.write("                    <form class=\"form-horizontal\" role=\"form\" method = \"post\" action = \"logInServlet?type=register\">\n");
      out.write("                        <h2>USER INFORMATION</h2>\n");
      out.write("                        <hr class=\"divider\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <span class=\"col-sm-4 control-label\">User Name<label>*</label></span>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" required name=\"username\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <span class=\"col-sm-4 control-label\">Password<label>*</label></span>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input class=\"form-control\" type=\"password\" required name=\"password1\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <span class=\"col-sm-4 control-label\">Confirm Password<label>*</label></span>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input class=\"form-control\" type=\"password\" required name=\"password2\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <span class=\"col-sm-4 control-label\">Email Address</span>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <span class=\"col-sm-4 control-label\">Telephone Number</span>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"tel\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                        String errorInfo = (String)request.getAttribute("errinfo"); 
                        if(errorInfo != null) {
                        out.println("<div class=\"col-md-9 col-md-offset-3\">");
                        out.println("<div class=\"alert alert-danger\">"+errorInfo+"</div>");
                        out.println("</div>");
                        }
                        
      out.write("\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-md-5, col-md-offset-7\">\n");
      out.write("                                <button type=\"reset\" value=\"Reset\" class=\"btn btn-default\">Reset</button>\n");
      out.write("                                <button type=\"submit\" value=\"Submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\t\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!------------------\n");
      out.write("        footer\n");
      out.write("     -------------------->\n");
      out.write("        <div id=\"footer\" class=\"text-center container-fluid\">\n");
      out.write("            <div class=\"section-title center\">\n");
      out.write("                <h2>Contact me</h2>\n");
      out.write("                <hr class=\"divider\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                <div class=\"col-md-4\"> <span class=\"glyphicon glyphicon-home\"></span>\n");
      out.write("                    <p>5620 Fifth Ave<br>\n");
      out.write("                        Pittsburgh,PA,15260</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\"> <span class=\"glyphicon glyphicon-envelope\"></span>\n");
      out.write("                    <p>zhl136@pitt.edu.cn</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\"> <span class=\"glyphicon glyphicon-phone glyphicon-lg\"></span>\n");
      out.write("                    <p> +1 951 801 0076</p>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!------------------\n");
      out.write("            copyright\n");
      out.write("         -------------------->\t\n");
      out.write("            <div class=\"copyright container-fluid\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                    <p>Copyright &copy; 2018 Zhixiang Liu @pitt</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
