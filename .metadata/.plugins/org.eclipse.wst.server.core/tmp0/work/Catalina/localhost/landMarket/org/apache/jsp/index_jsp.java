/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2022-01-27 16:54:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1631969049415L));
    _jspx_dependants.put("jar:file:/C:/market/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/landMarket/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <meta name=\"description\" content=\"????????? ???????????? ????????????\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"????????????, ???????????????, ????????????, ????????????, ?????????, ?????????\">\r\n");
      out.write("    <title>landMarket</title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./resources/css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./resources/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./resources/css/swiper.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./resources/css/font-awesome.css\">\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- ????????? -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/icons/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"assets/icons/favicon_72.png\" />\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"96x96\" href=\"assets/icons/favicon_96.png\" />\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/icons/favicon_144.png\" />\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"192x192\" href=\"assets/icons/favicon_192.png\" />\r\n");
      out.write("    \r\n");
      out.write("    <!-- ???????????? ?????? ?????? -->\r\n");
      out.write("    <meta property=\"og:title\" content=\"landMarket\" />\r\n");
      out.write("    <meta property=\"og:url\" content=\"https://github.com/\" />\r\n");
      out.write("    <meta property=\"og:image\" content=\"jpg\" />\r\n");
      out.write("    <meta property=\"og:description\" content=\"landMarket\" />\r\n");
      out.write("   \r\n");
      out.write("    <!-- ????????? ?????? ?????? -->\r\n");
      out.write("    <meta name=\"twitter:card\" content=\"summary\">\r\n");
      out.write("    <meta name=\"twitter:title\" content=\"landMarket\">\r\n");
      out.write("    <meta name=\"twitter:url\" content=\"https://github.com//\">\r\n");
      out.write("    <meta name=\"twitter:image\" content=\".jpg\">\r\n");
      out.write("    <meta name=\"twitter:description\" content=\"landMarket\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- ??? ?????? -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&subset=korean\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- HTLM5shiv ie6~8 -->\r\n");
      out.write("    <!--[if lt IE 9]> \r\n");
      out.write("      <script src=\"assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         alert(\"?????? ??????????????? ???????????? ????????????. ?????? ??????????????? ???????????????.!\");\r\n");
      out.write("      </script>\r\n");
      out.write("   <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"header clearfix\">\r\n");
      out.write("                    <nav id=\"mNav\">\r\n");
      out.write("                        <h2 class=\"ir_so\">????????????</h2>\r\n");
      out.write("                        <a href=\"#\" class=\"ham\"><span></span></a>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <nav class=\"nav\">\r\n");
      out.write("                        <ul class=\"clearfix\">\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">?????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <a id=\"logo\" href=\"#\">\r\n");
      out.write("                        <img src=\"./resources/img/logo.png\" alt=\"midLogo\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- //header -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"banner_menu\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"bm_left\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"total\"><a href=\"#\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i> ????????????</a></li>\r\n");
      out.write("                            <li class=\"line\"><a href=\"#\">?????????</a></li>\r\n");
      out.write("                            <li class=\"line\"><a href=\"#\">?????????</a></li>\r\n");
      out.write("                            <li class=\"line\"><a href=\"#\">??????/??????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bm_right\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                               <form action=\"search\" method=\"get\">\r\n");
      out.write("                                  <input type=\"text\" class=\"mainSearch\" name=\"searchPD\"><button type=\"submit\">??????</button>\r\n");
      out.write("                              </form>\r\n");
      out.write("                           </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"white\"><a href=\"#\">???</a></li>\r\n");
      out.write("                            <li class=\"purple\"><a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>\r\n");
      out.write("</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    <section id=\"banner\">\r\n");
      out.write("        <h2 class=\"ir_so\">Welcome!</h2>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"slider\">\r\n");
      out.write("            <div class=\"swiper-container\">\r\n");
      out.write("                <div class=\"swiper-wrapper\">\r\n");
      out.write("                    <div class=\"swiper-slide ss1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"swiper-slide ss2\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"swiper-slide ss3\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"swiper-pagination\"></div>\r\n");
      out.write("                <div class=\"swiper-button-prev\"></div>\r\n");
      out.write("                <div class=\"swiper-button-next\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- //banner -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <section id=\"prod\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"prod\">\r\n");
      out.write("                    <h2 class=\"ir_so\">Welcome MarketAkali</h2>\r\n");
      out.write("                    <div class=\"prod_title\">\r\n");
      out.write("                        <p class=\"sub\">?????? ??????????</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"prod_chart\">\r\n");
      out.write("                        <div class=\"swiper-container2\">\r\n");
      out.write("                            <div class=\"chart_cont1 swiper-wrapper\">\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/toma.jpg\" srcset=\"assets/img/toma@2.jpg 2x\"  alt=\"??????????????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>1</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>????????? ???????????? ???????????? 700g(??????)</h3>\r\n");
      out.write("                                        <p>59,900???</p>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/sal.jpg\" srcset=\"assets/img/sal@2.jpg 2x\"  alt=\"???????????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>2</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>[?????????] ????????? ?????? ????????? 159g</h3>\r\n");
      out.write("                                        <p>9,900???</p>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/kong.jpg\" srcset=\"assets/img/kong@2.jpg 2x\"  alt=\"???????????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>3</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>[kf365] ????????? ????????? ?????????</h3>\r\n");
      out.write("                                        <p>5,900???</p>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/orange.jpg\" srcset=\"assets/img/orange@2.jpg 2x\"  alt=\"?????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>4</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>???????????? ???????????? ????????????2.5kg</h3>\r\n");
      out.write("                                        <p>9,900???</p>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/chic.jpg\" srcset=\"assets/img/chic.jpg 2x\"  alt=\"?????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>5</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>[??????] ?????? ???????????? 4???</h3>\r\n");
      out.write("                                        <p>11,900???</p>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/jam.jpg\" srcset=\"assets/img/jam@2.jpg 2x\"  alt=\"?????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>6</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>[???????????? ????????????] ????????????&amp;????????? ??? 30g</h3>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/bread.jpg\" srcset=\"assets/img/bread@2.jpg 2x\"  alt=\"???????????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>7</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>[?????????] ???????????? ?????? ?????? 2???</h3>\r\n");
      out.write("                                        <p>5,100???</p>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"swiper-slide\">\r\n");
      out.write("                                    <div class=\"poster\">\r\n");
      out.write("                                        <figure>\r\n");
      out.write("                                            <img src=\"./resources/img/noodle.jpg\" srcset=\"assets/img/noodle@2.jpg 2x\"  alt=\"????????????\">\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                        <div class=\"rank\"><strong>8</strong></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"infor\">\r\n");
      out.write("                                        <h3>[?????? ?????????] ?????????</h3>\r\n");
      out.write("                                        <p>5,600???</p>\r\n");
      out.write("                                        <div class=\"infor_btn\">\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                            <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- //prod -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- ???????????? -->\r\n");
      out.write("    \r\n");
      out.write("    <section id=\"sidebar\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"#\">\r\n");
      out.write("          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("          <span>Dashboard</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li> \r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"#\">\r\n");
      out.write("          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("          <span>Games</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li> \r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"#\">\r\n");
      out.write("          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("          <span>Books</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"#\">\r\n");
      out.write("          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("          <span>Notifications</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>  \r\n");
      out.write("        <a href=\"#\">\r\n");
      out.write("          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("          <span>Settings</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"#\">\r\n");
      out.write("          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("          <span>Profile</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <details> <!-- ???????????? -->\r\n");
      out.write("      <summary>How it works<i class=\"ai-question-fill\"></i></summary>\r\n");
      out.write("          <div>\r\n");
      out.write("              <p>Inside each <code>&lt;a&gt;</code> element there's a hidden (using transform and opacity) <code>&lt;span&gt;</code> containing the text. Like this: </p>\r\n");
      out.write("            <p><pre><code>a span { \r\n");
      out.write("        &nbsp;position: absolute;\r\n");
      out.write("        &nbsp;left: calc(100% + 1.5rem); //Moves it all the way to the right\r\n");
      out.write("        &nbsp;\r\n");
      out.write("        &nbsp;opacity: 0;\r\n");
      out.write("        &nbsp;transform: scale(0);\r\n");
      out.write("        &nbsp;transform-origin: center left;\r\n");
      out.write("        &nbsp;transition: .15s ease;\r\n");
      out.write("        }</code></pre> \r\n");
      out.write("        <p>On hover or focus this span becomes visible through a transition of both transform and opacity. Like this:</p>\r\n");
      out.write("        <p><pre><code>a:hover span, a:focus span { \r\n");
      out.write("        &nbsp;opacity: 1;\r\n");
      out.write("        &nbsp;transform: scale(1);\r\n");
      out.write("        }</code></pre> \r\n");
      out.write("          <p>The <code>&lt;span&gt;</code> also has a psuedo-element in the shape of a rectangle, but rotated 45 degrees to make it look like a triangle. See the code for more details.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("    </details>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- // ???????????? -->\r\n");
      out.write("       \r\n");
      out.write("    <section id=\"event\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"event\">\r\n");
      out.write("                    <h2>????????? ?????????</h2>\r\n");
      out.write("                </div>   \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    <!-- // ?????? -->    \r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("        <div id=\"footer_sns\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"footer_sns\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"icon s1\"><a href=\"#\"><span class=\"ir_pm\">?????????</span></a></li>\r\n");
      out.write("                        <li class=\"icon s2\"><a href=\"#\"><span class=\"ir_pm\">????????????</span></a></li>\r\n");
      out.write("                        <li class=\"icon s3\"><a href=\"#\"><span class=\"ir_pm\">???????????????</span></a></li>\r\n");
      out.write("                        <li class=\"icon s4\"><a href=\"#\"><span class=\"ir_pm\">?????? ?????????</span></a></li>\r\n");
      out.write("                        <li class=\"icon s5\"><a href=\"#\"><span class=\"ir_pm\">????????? ????????????</span></a></li>\r\n");
      out.write("                    </ul>    \r\n");
      out.write("                    <div class=\"tel\">\r\n");
      out.write("                        <a href=\"#\">ARS <em>1544-0070</em></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"footer_infor\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"footer_infor\">\r\n");
      out.write("                        <h2><img src=\"./resources/img/logo_footer.png\" alt=\"landMarket\"></h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">??????/??????/???????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <address>\r\n");
      out.write("                            <p>??????????????? ????????? ???????????? 123, ???????????????(???) <br><span class=\"bar2\">???????????? ?????????</span>\r\n");
      out.write("                            <span class=\"bar2\">????????????????????? 123-45-67890</span> ??????????????????????????? ??? 833???</p>\r\n");
      out.write("                            <p>Copyright 2022 by marcketAkali Inc. All right reserved</p>\r\n");
      out.write("                        </address>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- //footer -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- ?????????????????? ??????????????? -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./resources/js/swiper.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("    //?????? ????????? ????????????\r\n");
      out.write("    var swiper = new Swiper('.swiper-container',{\r\n");
      out.write("        pagination: {\r\n");
      out.write("            el: '.swiper-pagination',\r\n");
      out.write("        },\r\n");
      out.write("        navigation: {\r\n");
      out.write("            nextEl: '.swiper-button-next',\r\n");
      out.write("            prevEl: '.swiper-button-prev',\r\n");
      out.write("        },\r\n");
      out.write("        autoplay: {\r\n");
      out.write("            delay: 5000,\r\n");
      out.write("        },\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // ??????????????? ????????? ????????????\r\n");
      out.write("    var swiper = new Swiper('.swiper-container2',{\r\n");
      out.write("        slidesPerView: 4,\r\n");
      out.write("        spaceBetween: 24,\r\n");
      out.write("        mousewheel: {\r\n");
      out.write("            invert: true,\r\n");
      out.write("        },\r\n");
      out.write("        keyboard: {\r\n");
      out.write("            enabled: true,\r\n");
      out.write("            onlyInViewport: false,\r\n");
      out.write("        },\r\n");
      out.write("        autoplay: {\r\n");
      out.write("            delay: 5000,\r\n");
      out.write("        },\r\n");
      out.write("        breakpoints: {\r\n");
      out.write("            600: {\r\n");
      out.write("                slidesPerView: 1.4,\r\n");
      out.write("                spaceBetween: 24\r\n");
      out.write("            },\r\n");
      out.write("            768: {\r\n");
      out.write("                slidesPerView: 2,\r\n");
      out.write("                spaceBetween: 24\r\n");
      out.write("            },\r\n");
      out.write("            960: {\r\n");
      out.write("                slidesPerView: 3,\r\n");
      out.write("                spaceBetween: 24\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
