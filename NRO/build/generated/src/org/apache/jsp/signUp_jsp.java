package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Au Register Forms by Colorlib</title>\n");
      out.write("\n");
      out.write("    <!-- Icons font CSS-->\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <!-- Font special for pages-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Vendor CSS-->\n");
      out.write("    <link href=\"vendor/select3/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/main1.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins\">\n");
      out.write("        <div class=\"wrapper wrapper--w680\">\n");
      out.write("            <div class=\"card card-4\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h2 class=\"title\">New Account</h2>\n");
      out.write("                    <form method=\"POST\">\n");
      out.write("                        <div class=\"row row-space\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">User</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"text\" name=\"user\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row row-space\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Pass</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"email\" name=\"pass\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Repass</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"text\" name=\"repass\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                              <div class=\"p-t-15\">\n");
      out.write("                            <button class=\"btn btn--radius-2 btn--blue\" type=\"submit\">Sign Up</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    <script src=\"vendor/jquery1/jquery.min.js\"></script>\n");
      out.write("    <!-- Vendor JS-->\n");
      out.write("    <script src=\"vendor/select3/select2.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/moment.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/global.js\"></script>\n");
      out.write("\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->");
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
