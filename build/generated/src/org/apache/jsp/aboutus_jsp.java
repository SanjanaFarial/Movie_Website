package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>aboutus</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/header.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>header</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String n = (String) session.getAttribute("name");
            if (n == null) {
      out.write("\n");
      out.write("        <div class=\"back\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <label style=\" font-size: 35px;color: #ffffff; margin-left:50px; \">Know your movies!</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu1\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a> </li>\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("                    <li><a href=\"aboutus.jsp\">About</a></li> \n");
      out.write("                    <li><a href=\"contactus.jsp\">Contact us</a></li> \n");
      out.write("                </ul>\n");
      out.write("                <div style=\"margin-top: 15px; margin-left: 280px;\">\n");
      out.write("                    <li><a href=\"login.jsp\" style=\"color:mintcream\">Sign in </a></li> &nbsp;&nbsp;\n");
      out.write("                    <li><a href=\"signup.jsp\" style=\"color:mintcream\">Sign up</a></li>s\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        <div class=\"back\">\n");
      out.write("            <div class=\"menu1\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a> </li>\n");
      out.write("                    <li><a href=\"login.jsp\"></a></li>  \n");
      out.write("                    <li><a href=\"userSession.jsp\"></a> </li>  \n");
      out.write("                    <li><a href=\"about.jsp\">About</a></li> \n");
      out.write("                    <li><a href=\"contactus.jsp\">Contact us</a></li> \n");
      out.write("                </ul>\n");
      out.write("                <div style=\"margin-top: 15px; margin-left: 180px;\">\n");
      out.write("                    <li><a href=\"logout.jsp\" style=\"color:mintcream\">LogOut </a></li> &nbsp;&nbsp;\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align: center;\">About us</h1>\n");
      out.write("        <form style=\"height: 200px\">\n");
      out.write("            <h2>This is a website where you can learn about different movies, their plots, casting, rating\n");
      out.write("            and other users' comments. You can post your rating too!</h2>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/footer.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <h3 style=\"color: #ffffff; margin-left: 550px;\">Know your movies!</h3>\n");
      out.write("            <div style=\"padding: 10px; color: #ffffff;\">\n");
      out.write("            <h3>This is a website where you can know about your favourite movies, people's opinion about them and \n");
      out.write("                you can post your opinion too! \n");
      out.write("                Don't be late and subscribe today!\n");
      out.write("     </h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("</html>\n");
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
