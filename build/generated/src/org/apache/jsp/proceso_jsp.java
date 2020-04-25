package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class proceso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>SOULMATE</title>\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/logo.png\" />\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <div class=\"header-logo\">\n");
      out.write("                                <a href=\"#\" class=\"logo\">\n");
      out.write("                                    <img src=\"./img/logo.png\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div style=\"text-align: right\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"header-search\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <div class=\"contenedor\">\n");
      out.write("                                         <article>\n");
      out.write("                                        <select id=\"btn-abrir-popup\" class=\"btn-abrir-popup\">\n");
      out.write("                                            <option value=\"0\">Filtro</option>\n");
      out.write("\n");
      out.write("                                            <option value=\"1\">Perros</option>\n");
      out.write("                                            <option value=\"1\">Gatos</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        \n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"contenedor\">\n");
      out.write("                            <article>\n");
      out.write("\n");
      out.write("                                <button id=\"btn-abrir-popup\" class=\"btn-abrir-popup\" onclick=\"location.href = 'adopcion.jsp?#'\">Dar en adopción.</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav id=\"navigation\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div id=\"responsive-nav\">\n");
      out.write("\n");
      out.write("                    <ul class=\"main-nav nav navbar-nav\">\n");
      out.write("                        <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                        <li><a href=\"inicio.jsp\">Mascotas en espera por ser adoptadas</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Mascotas en proceso de adopción</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- section title -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h3 class=\"title\">Mascotas en proceso de adopción</h3>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"products-tabs\">\n");
      out.write("                                <!-- tab -->\n");
      out.write("                                <div id=\"tab1\" class=\"tab-pane active\">\n");
      out.write("                                    <div class=\"products-slick\" data-nav=\"#slick-nav-1\">\n");
      out.write("\n");
      out.write("                                        <!--MASCOTA 1-->\n");
      out.write("                                        <div class=\"product\">\n");
      out.write("                                            <div class=\"product-img\">\n");
      out.write("                                                <img src=\"./img/p1.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-body\">\n");
      out.write("                                                <h3>kevy</h3>\n");
      out.write("                                                <p>Kevy es muy simpatico, pero a veces no le gusta bañarse, pero cuando es el día del platano se pone muuy feliz</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"add-to-cart\">\n");
      out.write("                                                <button class=\"add-to-cart-btn\">¡EN PROCESO!</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <!--MASCOTA 2-->\n");
      out.write("                                        <div class=\"product\">\n");
      out.write("                                            <div class=\"product-img\">\n");
      out.write("                                                <img src=\"./img/p2.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-body\">\n");
      out.write("                                                <h3>Kant</h3>\n");
      out.write("                                                <p>¡Este amiguito tiene energia infinita!</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"add-to-cart\">\n");
      out.write("                                                <button class=\"add-to-cart-btn\">¡EN PROCESO!</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <!-- MASCOTA 3 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <!-- MASCOTA 4 -->\n");
      out.write("                                        <div class=\"product\">\n");
      out.write("                                            <div class=\"product-img\">\n");
      out.write("                                                <img src=\"./img/p4.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-body\">\n");
      out.write("                                                <h3>King</h3>\n");
      out.write("                                                <p>King es el perro más tierno que existe :3 </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"add-to-cart\">\n");
      out.write("                                                <button class=\"add-to-cart-btn\">¡EN PROCESO!</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"slick-nav-1\" class=\"products-slick-nav\"></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"products-tabs\">\n");
      out.write("                            <!-- tab -->\n");
      out.write("                            <div id=\"tab2\" class=\"tab-pane fade in active\">\n");
      out.write("                                <div class=\"products-slick\" data-nav=\"#slick-nav-2\">\n");
      out.write("\n");
      out.write("                                    <!-- MASCOTA 5 -->\n");
      out.write("                                    <div class=\"product\">\n");
      out.write("                                        <div class=\"product-img\">\n");
      out.write("                                            <img src=\"./img/p5.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"product-body\">\n");
      out.write("                                            <h3>Louis</h3>\n");
      out.write("                                            <p>AFFVUIJA ibgiab OIGBSIKBGIKBDX</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"add-to-cart\">\n");
      out.write("                                            <button class=\"add-to-cart-btn\">¡EN PROCESO!</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- MASCOTA 6 -->\n");
      out.write("                                    <div class=\"product\">\n");
      out.write("                                        <div class=\"product-img\">\n");
      out.write("                                            <img src=\"./img/12.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"product-body\">\n");
      out.write("                                            <h3>lúis</h3>\n");
      out.write("                                            <p>Hgjugab asoihaoiks asokahibd</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"add-to-cart\">\n");
      out.write("                                            <button class=\"add-to-cart-btn\">¡EN PROCESO!</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /tab -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /Products tab & slick -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--PLUGINS -->\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script src=\"js/popup.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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