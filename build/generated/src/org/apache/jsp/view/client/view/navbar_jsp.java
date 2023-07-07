package org.apache.jsp.view.client.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      ");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      \r\n");
      out.write(" <div class=\"navbar navbar-default mega-menu\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!--Toggle navigation & logo-->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <img id=\"logo-header\" src=\"\" alt=\"EMS\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-responsive-collapse\">\r\n");
      out.write("                    <!-- Shopping Cart -->\r\n");
      out.write("                   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/client/view/cart.jsp", out, false);
      out.write("\r\n");
      out.write("                    <!-- End Shopping Cart -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Nav Menu -->\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <!-- Pages -->\r\n");
      out.write("                        <li class=\"dropdown active\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("                                Pages\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Index</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product/list\">Product Page</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/member/cart\">Cart</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/member/order\">Checkout</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\">Login</a></li>\r\n");
      out.write("                                <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register\">Register</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Pages -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Gifts -->\r\n");
      out.write("                        <li class=\"dropdown mega-menu-fullwidth\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("                                Gifts\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"mega-menu-content\">\r\n");
      out.write("                                        <div class=\"container\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-12 col-xs-12 md-margin-bottom-30\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Pellentes que nec diam lectus</h3>\r\n");
      out.write("                                                    <p>Proin pulvinar libero quis auctor pharet ra. Aenean fermentum met us orci, sedf eugiat augue pulvina r vitae. Nulla dolor nisl, molestie nec aliquam vitae, gravida sodals dolor...</p>\r\n");
      out.write("                                                    <button type=\"button\" class=\"btn-u btn-u-dark\">Read More</button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-4 col-xs-4 md-margin-bottom-30\">\r\n");
      out.write("                                                    <a href=\"#\"><img class=\"product-offers img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/blog/01.jpg\" alt=\"\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-4 col-xs-4 sm-margin-bottom-30\">\r\n");
      out.write("                                                    <a href=\"#\"><img class=\"product-offers img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/blog/02.jpg\" alt=\"\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-4 col-xs-4\">\r\n");
      out.write("                                                    <a href=\"#\"><img class=\"product-offers img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/blog/03.jpg\" alt=\"\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div><!--/end row-->\r\n");
      out.write("                                        </div><!--/end container-->\r\n");
      out.write("                                    </div><!--/end mega menu content-->  \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul><!--/end dropdown-menu-->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Gifts -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Categories -->\r\n");
      out.write("                        <li class=\"dropdown mega-menu-fullwidth\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("                               Categories\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"mega-menu-content\">\r\n");
      out.write("                                        <div class=\"container\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Clothe</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-Shirts</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Shoes</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">FLats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Accessories</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">All accessories</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Bags &amp; Purses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Scarvs &amp; Hats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jewellery</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Fragrance &amp; Beauty</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Lingerie</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Linger</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Slippers</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Nightwear</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Nightwear</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Mixed</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-shirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Flats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>        \r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Clothe</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-shirts</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Shoes</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Flats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Accessories</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">All accessories</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Bags &amp; Purses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Scarvs &amp; Hats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jewellery</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Fragrance &amp; Beauty</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Lingerie</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Linger</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Slippers</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Nightwear</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Nightwear</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Mixed</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-shirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Flats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div><!--/end row-->\r\n");
      out.write("                                        </div><!--/end container-->\r\n");
      out.write("                                    </div><!--/end mega menu content-->  \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul><!--/end dropdown-menu-->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Categories -->\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- End Nav Menu -->                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>            ");
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
}
