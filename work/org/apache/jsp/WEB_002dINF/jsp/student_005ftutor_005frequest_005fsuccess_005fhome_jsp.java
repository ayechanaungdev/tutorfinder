/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2022-08-11 03:09:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005ftutor_005frequest_005fsuccess_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(13);
    _jspx_dependants.put("/WEB-INF/jsp/inc/common.jsp", Long.valueOf(1658217370806L));
    _jspx_dependants.put("/WEB-INF/lib/struts-taglib-1.3.8.jar", Long.valueOf(1656877560000L));
    _jspx_dependants.put("jar:file:/C:/ACA%20Data/test/WorkspaceForHibernate/AyeChanAung_TutorFinderSystem/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-logic.tld", Long.valueOf(1172892492000L));
    _jspx_dependants.put("jar:file:/C:/ACA%20Data/test/WorkspaceForHibernate/AyeChanAung_TutorFinderSystem/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098687690000L));
    _jspx_dependants.put("/WEB-INF/lib/displaytag-1.2.jar", Long.valueOf(1658332280172L));
    _jspx_dependants.put("/WEB-INF/jsp/inc/footer.jsp", Long.valueOf(1657693333974L));
    _jspx_dependants.put("jar:file:/C:/ACA%20Data/test/WorkspaceForHibernate/AyeChanAung_TutorFinderSystem/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-html.tld", Long.valueOf(1172892492000L));
    _jspx_dependants.put("jar:file:/C:/ACA%20Data/test/WorkspaceForHibernate/AyeChanAung_TutorFinderSystem/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-bean.tld", Long.valueOf(1172892492000L));
    _jspx_dependants.put("jar:file:/C:/ACA%20Data/test/WorkspaceForHibernate/AyeChanAung_TutorFinderSystem/WEB-INF/lib/displaytag-1.2.jar!/META-INF/displaytag.tld", Long.valueOf(1230365746000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1656877560000L));
    _jspx_dependants.put("/WEB-INF/jsp/inc/connect-js.jsp", Long.valueOf(1657713285575L));
    _jspx_dependants.put("/WEB-INF/jsp/inc/head.jsp", Long.valueOf(1659971662311L));
    _jspx_dependants.put("/WEB-INF/jsp/inc/header_menu_student.jsp", Long.valueOf(1660183681278L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <title>Find Tutors - Student</title>\r\n");
      out.write(" ");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("  <meta content=\"\" name=\"description\">\r\n");
      out.write("  <meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Favicons -->\r\n");
      out.write("  <link href=\"assets/img/logo-tfs-no-text.png\" rel=\"icon\">\r\n");
      out.write("  <link href=\"assets/img/logo-tfs-no-text.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Fonts -->\r\n");
      out.write("  <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor CSS Files -->\r\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/quill/quill.snow.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/quill/quill.bubble.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/simple-datatables/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main CSS File -->\r\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- =======================================================\r\n");
      out.write("  * Template Name: NiceAdmin - v2.2.2\r\n");
      out.write("  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/\r\n");
      out.write("  * Author: BootstrapMade.com\r\n");
      out.write("  * License: https://bootstrapmade.com/license/\r\n");
      out.write("  ======================================================== -->");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("/*--------------------------------------------------------------\r\n");
      out.write("# Header\r\n");
      out.write("--------------------------------------------------------------*/\r\n");
      out.write("a {\r\n");
      out.write("  color: #8779E2;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size:11pt;\r\n");
      out.write("}\r\n");
      out.write(".profile-tab{\r\n");
      out.write(" \t background-color:#C3A9C7 !important;\r\n");
      out.write(" \t}\r\n");
      out.write(".logo {\r\n");
      out.write("  line-height: 1;\r\n");
      out.write("}\r\n");
      out.write("@media (min-width: 1200px) {\r\n");
      out.write("  .logo {\r\n");
      out.write("    width: 280px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(".logo img {\r\n");
      out.write("  max-height: 26px;\r\n");
      out.write("  margin-right: 6px;\r\n");
      out.write("}\r\n");
      out.write(".logo span {\r\n");
      out.write("  font-size: 26px;\r\n");
      out.write("  font-weight: 700;\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("  font-family: \"Nunito\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header {\r\n");
      out.write("  transition: all 0.5s;\r\n");
      out.write("  z-index: 997;\r\n");
      out.write("  height: 60px;\r\n");
      out.write("  box-shadow: 0px 2px 20px rgba(1, 41, 112, 0.1);\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  padding-left: 5px;\r\n");
      out.write("  padding-right: 5px;\r\n");
      out.write("  /* Toggle Sidebar Button */\r\n");
      out.write("  /* Search Bar */\r\n");
      out.write("}\r\n");
      out.write("#header-logo{\r\n");
      out.write("  padding-bottom: 25px;\r\n");
      out.write("}\r\n");
      out.write("#header-nav-logo{\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  margin-left: -60px !important;  /* 50% of your logo width */\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write(".header .toggle-sidebar-btn {\r\n");
      out.write("  font-size: 32px;\r\n");
      out.write("  padding-left: 10px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write(".header .search-bar {\r\n");
      out.write("  min-width: 360px;\r\n");
      out.write("  padding: 0 20px;\r\n");
      out.write("}\r\n");
      out.write("@media (max-width: 1199px) {\r\n");
      out.write("  .header .search-bar {\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    top: 50px;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    box-shadow: 0px 0px 15px 0px rgba(1, 41, 112, 0.1);\r\n");
      out.write("    background: white;\r\n");
      out.write("    z-index: 9999;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("    visibility: hidden;\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("  }\r\n");
      out.write("  .header .search-bar-show {\r\n");
      out.write("    top: 60px;\r\n");
      out.write("    visibility: visible;\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(".header .search-form {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write(".header .search-form input {\r\n");
      out.write("  border: 0;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("  border: 1px solid rgba(1, 41, 112, 0.2);\r\n");
      out.write("  padding: 7px 38px 7px 8px;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write(".header .search-form input:focus, .header .search-form input:hover {\r\n");
      out.write("  outline: none;\r\n");
      out.write("  box-shadow: 0 0 10px 0 rgba(1, 41, 112, 0.15);\r\n");
      out.write("  border: 1px solid rgba(1, 41, 112, 0.3);\r\n");
      out.write("}\r\n");
      out.write(".header .search-form button {\r\n");
      out.write("  border: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  margin-left: -30px;\r\n");
      out.write("  background: none;\r\n");
      out.write("}\r\n");
      out.write(".header .search-form button i {\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*--------------------------------------------------------------\r\n");
      out.write("# Header Nav\r\n");
      out.write("--------------------------------------------------------------*/\r\n");
      out.write(".header-nav ul {\r\n");
      out.write("  list-style: none;\r\n");
      out.write("}\r\n");
      out.write(".header-nav > ul {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .nav-icon {\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .nav-profile {\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .nav-profile img {\r\n");
      out.write("  max-height: 36px;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .nav-profile span {\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .badge-number {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  inset: 4px 6px auto auto;\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("  font-size: 11px;\r\n");
      out.write("  padding: 3px 6px;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .notifications .notification-item {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  padding: 15px 10px;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .notifications .notification-item i {\r\n");
      out.write("  margin: 0 20px 0 10px;\r\n");
      out.write("  font-size: 24px;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .notifications .notification-item h4 {\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .notifications .notification-item p {\r\n");
      out.write("  font-size: 13px;\r\n");
      out.write("  margin-bottom: 3px;\r\n");
      out.write("  color: #F1E3F3;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .notifications .notification-item:hover {\r\n");
      out.write("  background-color: #f3f0e9;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .messages .message-item {\r\n");
      out.write("  padding: 15px 10px;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .messages .message-item a {\r\n");
      out.write("  display: flex;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .messages .message-item img {\r\n");
      out.write("  margin: 0 20px 0 10px;\r\n");
      out.write("  max-height: 40px;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .messages .message-item h4 {\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  margin-bottom: 5px;\r\n");
      out.write("  color: #444444;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .messages .message-item p {\r\n");
      out.write("  font-size: 13px;\r\n");
      out.write("  margin-bottom: 3px;\r\n");
      out.write("  color: #F1E3F3;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .messages .message-item:hover {\r\n");
      out.write("  background-color: #f3f0e9;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .profile {\r\n");
      out.write("  min-width: 240px;\r\n");
      out.write("  padding-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .profile .dropdown-header h6 {\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  margin-bottom: 0;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  color: #444444;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .profile .dropdown-header span {\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .profile .dropdown-item {\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  padding: 10px 15px;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .profile .dropdown-item i {\r\n");
      out.write("  margin-right: 10px;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  line-height: 0;\r\n");
      out.write("}\r\n");
      out.write(".header-nav .profile .dropdown-item:hover {\r\n");
      out.write("  background-color: #f3f0e9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*--------------------------------------------------------------\r\n");
      out.write("# Sidebar\r\n");
      out.write("--------------------------------------------------------------*/\r\n");
      out.write(".sidebar {\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 60px;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  width: 245px;\r\n");
      out.write("  z-index: 996;\r\n");
      out.write("  transition: all 0.3s;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  overflow-y: auto;\r\n");
      out.write("  scrollbar-width: thin;\r\n");
      out.write("  scrollbar-color: #aab7cf transparent;\r\n");
      out.write("  box-shadow: 0px 0px 20px rgba(1, 41, 112, 0.1);\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("@media (max-width: 1199px) {\r\n");
      out.write("  .sidebar {\r\n");
      out.write("    left: -245px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(".sidebar::-webkit-scrollbar {\r\n");
      out.write("  width: 5px;\r\n");
      out.write("  height: 8px;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".sidebar::-webkit-scrollbar-thumb {\r\n");
      out.write("  background-color: #aab7cf;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 1200px) {\r\n");
      out.write("  #main, #footer {\r\n");
      out.write("    margin-left: 245px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("@media (max-width: 1199px) {\r\n");
      out.write("  .toggle-sidebar .sidebar {\r\n");
      out.write("    left: 0;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("@media (min-width: 1200px) {\r\n");
      out.write("  .toggle-sidebar #main, .toggle-sidebar #footer {\r\n");
      out.write("    margin-left: 0;\r\n");
      out.write("  }\r\n");
      out.write("  .toggle-sidebar .sidebar {\r\n");
      out.write("    left: -245px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-nav {\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  list-style: none;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav li {\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  list-style: none;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-item {\r\n");
      out.write("  margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-heading {\r\n");
      out.write("  font-size: 11px;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  color: #899bbd;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  margin: 10px 0 5px 15px;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("  transition: 0.3;\r\n");
      out.write("  background: #f3f0e9;\r\n");
      out.write("  padding: 10px 15px;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link i {\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  margin-right: 10px;\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link.collapsed {\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("  background: #fff;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link.collapsed i {\r\n");
      out.write("  color: #899bbd;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link:hover {\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("  background: #f3f0e9;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link:hover i {\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link .bi-chevron-down {\r\n");
      out.write("  margin-right: 0;\r\n");
      out.write("  transition: transform 0.2s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-link:not(.collapsed) .bi-chevron-down {\r\n");
      out.write("  transform: rotate(180deg);\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-content {\r\n");
      out.write("  padding: 5px 0 0 0;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  list-style: none;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-content a {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("  transition: 0.3;\r\n");
      out.write("  padding: 10px 0 10px 40px;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-content a i {\r\n");
      out.write("  font-size: 6px;\r\n");
      out.write("  margin-right: 8px;\r\n");
      out.write("  line-height: 0;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-content a:hover, .sidebar-nav .nav-content a.active {\r\n");
      out.write("  color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav .nav-content a.active i {\r\n");
      out.write("  background-color: #5E445F;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header{\r\n");
      out.write("\tbackground-color:#C3A9C7;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write(" background-color: #F7F2F7;\r\n");
      out.write(" }\r\n");
      out.write("</style>\r\n");
      out.write("<!-- ======= Header ======= -->\r\n");
      out.write("  <header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("      <i class=\"bi bi-list toggle-sidebar-btn\"></i>\r\n");
      out.write("    </div><!-- End menu -->\r\n");
      out.write("\r\n");
      out.write("<nav id=\"header-logo\" class=\"header-nav ms-auto\">\r\n");
      out.write("      <ul id=\"header-nav-logo\" class=\"d-flex align-items-center\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a href=\"#\" class=\"logo d-flex align-items-center\">\r\n");
      out.write("            <img src=\"assets/img/logo-tfs-no-text.png\" alt=\"\">\r\n");
      out.write("            <span class=\"d-none d-lg-inline text-nowrap\">TutorFinder</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li><!-- End Logo -->\r\n");
      out.write("    </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <nav class=\"header-nav\">\r\n");
      out.write("      <ul class=\"d-flex align-items-center\">\r\n");
      out.write("        <li class=\"nav-item dropdown pe-3\">\r\n");
      out.write("\r\n");
      out.write("          <a class=\"nav-link nav-profile d-flex align-items-center pe-0\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("            <img src=\"images/stu_");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${StudentFormBean.loginPjStudent.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("?time=");
      out.print(System.currentTimeMillis());
      out.write("\" alt=\"Profile\" class=\"rounded-circle\">\r\n");
      out.write("            <span class=\"d-none d-md-block dropdown-toggle ps-2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${StudentFormBean.loginPjStudent.studentName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("          </a><!-- End Profile Image Icon -->\r\n");
      out.write("\r\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\r\n");
      out.write("            <li class=\"dropdown-header\">\r\n");
      out.write("              <h6>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${StudentFormBean.loginPjStudent.studentEmail }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("              <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${StudentFormBean.loginPjStudent.grade}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <hr class=\"dropdown-divider\">\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"myProfilePath.do\">\r\n");
      out.write("                <i class=\"bi bi-person\"></i>\r\n");
      out.write("                <span>Profile Overview</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"StuUpdatePathFirst.do\">\r\n");
      out.write("                <i class=\"bi bi-pencil-square\"></i>\r\n");
      out.write("                <span>Edit Profile</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <hr class=\"dropdown-divider\">\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"StuChangePasswordPathFirst.do\">\r\n");
      out.write("                <i class=\"bi bi-gear\"></i>\r\n");
      out.write("                <span>Change Password</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <hr class=\"dropdown-divider\">\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"StuLogoutPath.do\">\r\n");
      out.write("                <i class=\"bi bi-box-arrow-right\"></i>\r\n");
      out.write("                <span>Logout</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("          </ul><!-- End Profile Dropdown Items -->\r\n");
      out.write("        </li><!-- End Profile Nav -->\r\n");
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav><!-- End Icons Navigation -->\r\n");
      out.write("\r\n");
      out.write("  </header><!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("  <!-- ======= Sidebar ======= -->\r\n");
      out.write("  <aside id=\"sidebar\" class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link \" href=\"stuHomePath.do?frmControl=0\">\r\n");
      out.write("          <i class=\"bi bi-house-door\"></i>\r\n");
      out.write("          <span>Home</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- End Home Nav -->\r\n");
      out.write("      \r\n");
      out.write("      <li class=\"dropdown-divider\"></li>\r\n");
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"findTutorsPathFirst.do?frmControl=0\">\r\n");
      out.write("          <i class=\"bi bi-search\"></i>\r\n");
      out.write("          <span>Find Tutors</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- End Find Tutors Page Nav -->\r\n");
      out.write("\r\n");
      out.write("\t  <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"myTutorsPath.do?frmControlMyTutors=0\">\r\n");
      out.write("          <i class=\"bi bi-person-check\"></i>\r\n");
      out.write("          <span>My Tutors</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- End My Tutors Page Nav -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"sendFeedbackPath.do?frmControlMyTutors=0\">\r\n");
      out.write("          <i class=\"bi bi-chat-quote\"></i>\r\n");
      out.write("          <span>Send Feedback</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- End Send Feedback Page Nav -->\r\n");
      out.write("      <li class=\"dropdown-divider\"></li>\r\n");
      out.write("\t<li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#components-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("          <i class=\"bi bi-gear\"></i><span>Account Setting</span><i class=\"bi bi-chevron-down ms-auto\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"components-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"myProfilePath.do?\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Profile Overview</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"StuUpdatePathFirst.do\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Edit Profile</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"StuChangePasswordPathFirst.do\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Change Password</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"StuDeleteProfilePathFirst.do\">\r\n");
      out.write("              <i class=\"bi bi-circle\"></i><span><font color=\"red\">Delete Account</font></span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li><!-- End Components Nav -->\r\n");
      out.write("      <li class=\"dropdown-divider\"></li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"StuLogoutPath.do\">\r\n");
      out.write("          <i class=\"bi bi-box-arrow-right\"></i>\r\n");
      out.write("          <span>Logout</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li><!-- End Logout Nav -->\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("  </aside><!-- End Sidebar-->");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  <main id=\"main\" class=\"main\">\r\n");
      out.write("  \t  <div class=\"pagetitle\">\r\n");
      out.write("      <h1>Request Tutor</h1>\r\n");
      out.write("      <nav>\r\n");
      out.write("        <ol class=\"breadcrumb\">\r\n");
      out.write("          <li class=\"breadcrumb-item\">Student Home</li>\r\n");
      out.write("          <li class=\"breadcrumb-item\">Tutors' Details</li>\r\n");
      out.write("          <li class=\"breadcrumb-item\">Request Tutor</li>\r\n");
      out.write("           <li class=\"breadcrumb-item\">Request Success</li>\r\n");
      out.write("        </ol>\r\n");
      out.write("      </nav>\r\n");
      out.write("    </div><!-- End Page Title -->\r\n");
      out.write("  \t <section>\r\n");
      out.write("  \t \t <div class=\"card mb-3\">\r\n");
      out.write("\t\t\t\t<div class=\"card-header text-center\">Request Tutor</div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"pt-4 pb-2\">\r\n");
      out.write("                    <h5 class=\"card-title text-center pb-0 fs-4\"><b>Your Request is Sent!</b></h5>\r\n");
      out.write("                  </div>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><td>Now, check your <a href=\"myTutorsPath.do?frmControlMyTutors=0\">Tutor List</a>.</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>or, Go back to <a href=\"stuHomePath.do?frmControl=0\">Home</a>.</td></tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("    </section>\r\n");
      out.write("  \t\r\n");
      out.write("  </main>\r\n");
      out.write("  ");
      out.write(" <!-- ======= Footer ======= -->\n");
      out.write("  <footer id=\"footer\" class=\"footer\">\n");
      out.write("    <div class=\"copyright\">\n");
      out.write("      &copy; Copyright <strong><span>J2EE Project 2022 @GICM</span></strong>. All Rights Reserved\n");
      out.write("    </div>\n");
      out.write("    <div class=\"credits\">\n");
      out.write("      Developed by <i>Aye Chan Aung</i>\n");
      out.write("    </div>\n");
      out.write("  </footer><!-- End Footer -->\n");
      out.write("  \n");
      out.write("   <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("  \n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" ");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor JS Files -->\r\n");
      out.write("  <script src=\"assets/vendor/apexcharts/apexcharts.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/chart.js/chart.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/echarts/echarts.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/quill/quill.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/simple-datatables/simple-datatables.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/tinymce/tinymce.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main JS File -->\r\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
