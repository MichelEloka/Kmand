/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-12-12 17:51:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"fr\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Kmand - Accueil</title>\r\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../styles/acceuil.css\"> \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write("/* Style global de la page */\r\n");
      out.write("body {\r\n");
      out.write("    font-family: 'Arial', sans-serif;\r\n");
      out.write("    background-color: #f4f7fa;\r\n");
      out.write("    color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Message de bienvenue */\r\n");
      out.write(".header {\r\n");
      out.write("    background-color: #2a2a72;\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 40px 30px;\r\n");
      out.write("    font-size: 28px;\r\n");
      out.write("    font-family: 'Brush Script MT', cursive;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header h1 {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-size: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Conteneur principal */\r\n");
      out.write(".container {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Logo */\r\n");
      out.write(".logo {\r\n");
      out.write("    font-size: 100px;\r\n");
      out.write("    color: #2a2a72;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style des boutons */\r\n");
      out.write(".buttons a {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin: 15px 20px;\r\n");
      out.write("    padding: 12px 25px;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    transition: all 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Bouton personnalisÃ© */\r\n");
      out.write(".btn-custom {\r\n");
      out.write("    background-color: #007bff;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    box-shadow: 0 4px 6px rgba(0, 123, 255, 0.3); /* Ombre lÃ©gÃ¨re */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-custom:hover {\r\n");
      out.write("    background-color: #0056b3;\r\n");
      out.write("    box-shadow: 0 6px 12px rgba(0, 123, 255, 0.5); /* Ombre plus prononcÃ©e au survol */\r\n");
      out.write("    transform: translateY(-3px); /* Animation au survol */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Animation d'apparition */\r\n");
      out.write(".animation {\r\n");
      out.write("    animation: fadeIn 1.5s ease-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fadeIn {\r\n");
      out.write("    from {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("        transform: translateY(-50px);\r\n");
      out.write("    }\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: translateY(0);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <h1 class=\"animation\">Bienvenue sur Kmand</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container animation\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <i class=\"fas fa-box-open\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"buttons\">\r\n");
      out.write("            <a href=\"/kmand/formclient\" class=\"btn btn-custom\">Ajouter Client</a>\r\n");
      out.write("            <a href=\"/kmand/formcommande\" class=\"btn btn-custom\">Ajouter Commande</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
