/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-01-28 07:00:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin.membermanagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class normaluser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/inc/asset.jsp", Long.valueOf(1643163416404L));
    _jspx_dependants.put("jar:file:/E:/project/득근득근_JSP프로젝트/LastTeamProject3/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Team3/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/inc/header.jsp", Long.valueOf(1643301986348L));
    _jspx_dependants.put("/WEB-INF/views/inc/footer.jsp", Long.valueOf(1643101689828L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1643088127061L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>SHOP | 득근득근케어일기</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/team3/asset/css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/team3/asset/css/header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/team3/asset/css/footer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/team3/asset/css/font.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.14.0/css/all.css\" integrity=\"sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc\" crossorigin=\"anonymous\">\r\n");
      out.write(" \r\n");
      out.write("<script src=\"/team3/asset/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	    #content{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            /* border: 1px solid black; */\r\n");
      out.write("            /* box-sizing: border-box; */\r\n");
      out.write("        }\r\n");
      out.write("        #container{\r\n");
      out.write("            width: 1000px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("            margin-bottom: 200px;\r\n");
      out.write("            /* border: 1px solid black; */\r\n");
      out.write("            /* box-sizing: border-box; */\r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- header -->\r\n");
      out.write("    <div id=\"inc-header\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <form action=\"\">\r\n");
      out.write("                <header>\r\n");
      out.write("                    <div id=\"logo\"><a href=\"#\"><img src=\"/team3/asset/images/logo1.png\" alt=\"로고\"><span id=\"first\">득근득근</span><br>케어일기</a></div>\r\n");
      out.write("                    <div id=\"search\"><input type=\"text\" placeholder=\"검색하기\"><a href=\"#!\"><i class=\"fas fa-search\" style=\"font-size:1.5rem; margin-left: 2.3rem;\"></i></a></div>\r\n");
      out.write("                    <div id=\"menu\">\r\n");
      out.write("                        <a href=\"#!\">로그인 </a>&nbsp;|&nbsp; \r\n");
      out.write("                        <a href=\"#!\">회원가입 </a>&nbsp;|&nbsp; \r\n");
      out.write("                        <a href=\"#!\">주문조회 </a>&nbsp;|&nbsp; \r\n");
      out.write("                        <a href=\"#!\">고객센터</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"line_ccc\"></div>\r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"side\">\r\n");
      out.write("                    <a href=\"#!\"><i class=\"fas fa-bars\" style=\"margin-right: 1rem;\"></i>전체 카테고리</a>\r\n");
      out.write("                    <ul id=\"drop-category\">\r\n");
      out.write("                        <li onclick=\"location.href='';\">닭가슴살</li>\r\n");
      out.write("                        <li onclick=\"location.href='';\">도시락</li>\r\n");
      out.write("                        <li onclick=\"location.href='';\">야채류</li>\r\n");
      out.write("                        <li onclick=\"location.href='';\">단백질보충제</li>\r\n");
      out.write("                        <li onclick=\"location.href='';\">기타영양제</li>\r\n");
      out.write("                        <li onclick=\"location.href='';\">영양별 상품조회</li>\r\n");
      out.write("                        <li onclick=\"location.href='';\">개인별 상품조회</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"main-nav\"><a href=\"#!\">베스트</a></div>\r\n");
      out.write("                <div class=\"main-nav\"><a href=\"#!\">신상품</a></div>\r\n");
      out.write("                <div class=\"main-nav\"><a href=\"#!\">헬스케어</a></div>\r\n");
      out.write("                <div class=\"main-nav\"><a href=\"#!\">득근영상</a></div>\r\n");
      out.write("                <div class=\"side\">\r\n");
      out.write("                    <div><a href=\"#!\"><i class=\"fas fa-user-circle\"></i></a></div>\r\n");
      out.write("                    <div><a href=\"#!\"><i class=\"fas fa-shopping-cart\"></i></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"line_black\"></div>\r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("	<!-- location -->\r\n");
      out.write("    <div id=\"inc-location\">\r\n");
      out.write("        <div>주문/배송 관리</div>\r\n");
      out.write("        <div>\r\n");
      out.write("            관리자모드\r\n");
      out.write("            <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("            주문/배송관리\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- content  -->\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("        <div id=\"container\">\r\n");
      out.write("    \r\n");
      out.write("			<h1>테스트</h1>\r\n");
      out.write("	\r\n");
      out.write("	    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- footer -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- footer -->\r\n");
      out.write("    <div id=\"inc-footer\">\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div id=\"footer-top\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#!\">고객센터</a></li>\r\n");
      out.write("                    <li><a href=\"#!\">이용약관</a></li>\r\n");
      out.write("                    <li><a href=\"#!\">개인정보처리방침</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"line_ccc\"></div>\r\n");
      out.write("            <div id=\"footer-bottom\">\r\n");
      out.write("                <div>고객센터 070-9999-8888</div>\r\n");
      out.write("                <div>득근득근케어일기 | (주)득근득근 | 대표: 김득근 | 개인정보보호책임자: 왕근육 | E-mail: admin@deukgeun.com</div>\r\n");
      out.write("                <div>서울특별시 강남구 근육로 3대 500, (득근빌딩)</div>\r\n");
      out.write("                <div>사업자등록번호:100-01-11111 사업자정보 확인 > 통신판매업신고 </div>\r\n");
      out.write("                <div>&copy; Deukgeun, Inc.</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("	\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/admin/membermanagement/normaluser.jsp(51,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result == 1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		//성공\r\n");
          out.write("		location.href = '/team3/admin/membermanagement/membermanagement.do?column=id&word=&userType=allUser';\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/admin/membermanagement/normaluser.jsp(56,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result == 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		//실패\r\n");
          out.write("		alert('failed');\r\n");
          out.write("		history.back();\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
