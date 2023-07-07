package org.apache.jsp.view.client.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Product List</title>\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("<!-- Web Fonts -->\r\n");
      out.write("<link rel='stylesheet' type='text/css'\r\n");
      out.write("\thref='//fonts.googleapis.com/css?family=Open+Sans:400,300,600&amp;subset=cyrillic,latin'>\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Global Compulsory -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/shop.style.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Header and Footer -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/headers/header-v5.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/footers/footer-v4.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Implementing Plugins -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/animate.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/line-icons/line-icons.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/noUiSlider/jquery.nouislider.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/scrollbar/css/jquery.mCustomScrollbar.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Style Switcher -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/plugins/style-switcher.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/theme-colors/default.css\"\r\n");
      out.write("\tid=\"style_color\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Customization -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/custom.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body class=\"header-fixed\">\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<!--=== Header v5 ===-->\r\n");
      out.write("\t\t<div class=\"header-v5 header-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t<!-- Topbar v3 -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<!-- End Topbar v3 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Navbar -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<!-- End Navbar -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--=== End Header v5 ===-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--=== Breadcrumbs v4 ===-->\r\n");
      out.write("\t\t<div class=\"breadcrumbs-v4\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<span class=\"page-name\">Product Page</span>\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\tMaecenas <span class=\"shop-green\">enim</span> sapien\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t<ul class=\"breadcrumb-v4-in\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product/list\">Product</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\">List Product</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/end container-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--=== End Breadcrumbs v4 ===-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--=== Content Part ===-->\r\n");
      out.write("\t\t<div class=\"content container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/client/view/seach.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row margin-bottom-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4 result-category\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Men</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<small class=\"shop-bg-red badge-results\">45 Results</small>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"list-inline clear-both\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"grid-list-icons\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"shop-ui-filter-list.html\"><i class=\"fa fa-th-list\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"shop-ui-filter-grid.html\"><i class=\"fa fa-th\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"sort-list-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Sort By :</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tPopularity <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">All</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Best Sales</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Top Last Week Sales</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">New Arrived</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"sort-list-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Show :</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t20 <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">All</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">10</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--/end result category-->\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--/end filter resilts-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"pagination pagination-v2\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-left\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-right\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--/end pagination-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/end row-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--/end container-->\r\n");
      out.write("\t\t<!--=== End Content Part ===-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--=== Shop Suvbscribe ===-->\r\n");
      out.write("\t\t<div class=\"shop-subscribe\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 md-margin-bottom-20\">\r\n");
      out.write("\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\tsubscribe to our weekly <strong>newsletter</strong>\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Email your email...\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/end container-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--=== End Shop Suvbscribe ===-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--=== Footer v4 ===-->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!--=== End Footer v4 ===-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--/wrapper-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- JS Global Compulsory -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/jquery/jquery-migrate.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- JS Implementing Plugins -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/back-to-top.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/smoothScroll.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/noUiSlider/jquery.nouislider.all.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("\t<!-- JS Customization -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/custom.js\"></script>\r\n");
      out.write("\t<!-- JS Page Level -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/shop.app.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/plugins/mouse-wheel.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tjQuery(document).ready(function() {\r\n");
      out.write("\t\t\tApp.init();\r\n");
      out.write("\t\t\tApp.initScrollBar();\r\n");
      out.write("\t\t\tMouseWheel.initMouseWheel();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/respond.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/plugins/placeholder-IE-fixes.js\"></script>    \r\n");
      out.write("<![endif]-->\r\n");
      out.write("\t<!--[if lt IE 10]>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/sky-forms-pro/skyforms/js/jquery.placeholder.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
    _jspx_th_c_url_0.setValue("/view/client/static");
    _jspx_th_c_url_0.setVar("url");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class=\"filter-results\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<div\r\n");
          out.write("\t\t\t\t\t\t\t\tclass=\"list-product-description product-description-brd margin-bottom-30\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/product/detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"img-responsive sm-margin-bottom-20\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\talt=\"\"></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 product-description\">\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"overflow-h margin-bottom-5\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-inline overflow-h\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><h4 class=\"title-price\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/product/detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</h4></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><span class=\"gender text-uppercase\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.category.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"pull-right\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-inline product-ratings\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"rating-selected fa fa-star\"></i></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"rating-selected fa fa-star\"></i></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"rating-selected fa fa-star\"></i></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"rating fa fa-star\"></i></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"rating fa fa-star\"></i></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"margin-bottom-10\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"title-price margin-right-10\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".0</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"title-price line-through\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price *1.25 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"margin-bottom-20\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.des }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-inline add-to-wishlist margin-bottom-20\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"wishlist-in\"><i class=\"fa fa-heart\"></i> <a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/product/detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\">Add\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tto Wishlist</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"compare-in\"><i class=\"fa fa-exchange\"></i> <a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/product/detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\">Add\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tto Compare</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/product/detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"button\" class=\"btn-u btn-u-sea-shop\">Add to\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tCart</button></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/image?fname=${p.image }", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
