package org.apache.jsp.view.client.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value_nobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar readURL = function(input) {\r\n");
      out.write("\t\t\tif (input.files && input.files[0]) {\r\n");
      out.write("\t\t\t\tvar reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treader.onload = function(e) {\r\n");
      out.write("\t\t\t\t\t$('.avatar').attr('src', e.target.result);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treader.readAsDataURL(input.files[0]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$(\".file-upload\").on('change', function() {\r\n");
      out.write("\t\t\treadURL(this);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>My Account</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<div class=\"container bootstrap snippet\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t<h1>USER INFORMATION</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\" class=\"pull-right\"><img\r\n");
      out.write("\t\t\t\t\ttitle=\"profile image\" class=\"img-circle img-responsive\"\r\n");
      out.write("\t\t\t\t\tsrc=\"http://www.gravatar.com/avatar/28fd20ccec6865e2d5f0e1f4446eb7bf?s=100\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<form class=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myaccount }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\"\r\n");
      out.write("\t\t\t\t\tid=\"registrationForm\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t<input name=\"role\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.roleId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" hidden=\"\" >\r\n");
      out.write("\t\t\t\t\t<input name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" hidden=\"\">\r\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imgUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"avatar img-circle img-thumbnail\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"avatar\">\r\n");
      out.write("\t\t\t\t\t\t<h6>Upload a different photo...</h6>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" name=\"avatar\" class=\"text-center center-block file-upload\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</hr>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane active\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"first_name\"><h4>User Name:</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"first_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"enter your first name if any.\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"first_name\"><h4>Email:</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"email\" id=\"first_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.email }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"enter your first name if any.\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"phone\"><h4>Password</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"password\" class=\"form-control\" name=\"password\" id=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.password }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"enter your phone number if any.\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"last_name\"><h4>Website</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"website\" id=\"last_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"http://prjfptshop.vn\" title=\"enter your last name if any.\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdisabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-lg btn-success\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-ok-sign\"></i> Save\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-lg\" type=\"reset\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-repeat\"></i> Reset\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane\" id=\"messages\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<h2></h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane\" id=\"settings\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form\" action=\"\" method=\"post\" id=\"registrationForm\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"first_name\"><h4>First name</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"first_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"first_name\" placeholder=\"first name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"enter your first name if any.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"last_name\"><h4>Last name</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"last_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"last_name\" placeholder=\"last name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"enter your last name if any.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"phone\"><h4>Phone</h4></label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"phone\" id=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"enter phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"enter your phone number if any.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"mobile\"><h4>Mobile</h4></label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"mobile\" id=\"mobile\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"enter mobile number\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"enter your mobile number if any.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"email\"><h4>Email</h4></label> <input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"email\" id=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"you@email.com\" title=\"enter your email.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"email\"><h4>Location</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"email\" class=\"form-control\" id=\"location\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"somewhere\" title=\"enter a location\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"password\"><h4>Password</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\" class=\"form-control\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"password\" placeholder=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"enter your password.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"password2\"><h4>Verify</h4></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\" class=\"form-control\" name=\"password2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"password2\" placeholder=\"password2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"enter your password2.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-lg btn-success pull-right\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-ok-sign\"></i> Save\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Back</a></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/member/myaccount");
    _jspx_th_c_url_0.setVar("myaccount");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/image?fname=${sessionScope.account.avatar }", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_url_1.setVar("imgUrl");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
}
