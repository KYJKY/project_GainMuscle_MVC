/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-01-27 13:32:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.healthcare;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addwantspec_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/inc/asset.jsp", Long.valueOf(1643163416404L));
    _jspx_dependants.put("jar:file:/E:/project/득근득근_JSP프로젝트/LastTeamProject3/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Team3/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/inc/header.jsp", Long.valueOf(1643101413098L));
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
      out.write("  <link rel=\"stylesheet\" href=\"/team3/asset/css/healthcare.css/healthcare_want.css\" />\r\n");
      out.write("    <style>\r\n");
      out.write("      #content {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 1200px;\r\n");
      out.write("        /* border: 1px solid black; */\r\n");
      out.write("        /* box-sizing: border-box; */\r\n");
      out.write("      }\r\n");
      out.write("      #container {\r\n");
      out.write("        width: 1000px;\r\n");
      out.write("        height: 500px;\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("        /* border: 1px solid black; */\r\n");
      out.write("        /* box-sizing: border-box; */\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
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
      out.write("     <div id=\"inc-location\">\r\n");
      out.write("      <div>헬스케어</div>\r\n");
      out.write("      <div>\r\n");
      out.write("        메인\r\n");
      out.write("        <i class=\"fas fa-angle-right\"></i\r\n");
      out.write("        ><a href=\"healthcare_main.html\"> 헬스케어</a>\r\n");
      out.write("        <i class=\"fas fa-angle-right\"></i\r\n");
      out.write("        ><a href=\"healthcare_now.html\"> 정보입력</a>\r\n");
      out.write("        <i class=\"fas fa-angle-right\"></i\r\n");
      out.write("        ><a href=\"healthcare_want.html\"> 목표입력</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- content  -->\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("      <!-- 헬스케어 이미지 -->\r\n");
      out.write("      <div class=\"healthcare_main_img\">\r\n");
      out.write("        <div id=\"cover\">\r\n");
      out.write("         <img src=\"/team3/asset/images/healthcaremain.jpg\" style=\"opacity: 0.9\" />\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"container\">\r\n");
      out.write("        <!-- 헬스케어 목표스펙 입력창 제목 1/2 -->\r\n");
      out.write("        <form method=\"GET\" name=\"healthcare_want_form\" action=\"/team3/healthcare/specresult.do\">\r\n");
      out.write("          <div class=\"formtotal\">\r\n");
      out.write("            <div class=\"font\">\r\n");
      out.write("              <i class=\"fas fa-lightbulb\"\r\n");
      out.write("                ><span id=\"subfont1\"\r\n");
      out.write("                  >&nbsp;&nbsp;회원님의 목표 인바디를 입력해주세요.</span\r\n");
      out.write("                ></i\r\n");
      out.write("              >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear: both\"></div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 헬스케어 목표스펙 정보 입력창 -->\r\n");
      out.write("            <div id=\"weight\">\r\n");
      out.write("              <label>목표 체중</label>\r\n");
      out.write("              <input type=\"number\" value=\"몸무게\" name=\"wantweight\" />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"fat\">\r\n");
      out.write("              <label>목표 체지방량</label>\r\n");
      out.write("              <input type=\"number\" value=\"체지방량\" name=\"wantfat\" />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"muscle\">\r\n");
      out.write("              <label>목표 근육량</label>\r\n");
      out.write("              <input type=\"number\" value=\"근육량\" name=\"wantmuscle\" />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 헬스케어 목표스펙 입력창 제목 2/2 -->\r\n");
      out.write("            <div class=\"font\">\r\n");
      out.write("              <i class=\"fas fa-lightbulb\"\r\n");
      out.write("                ><span id=\"subfont2\"\r\n");
      out.write("                  >&nbsp;&nbsp;회원님의 운동 목적과 목표 기간을\r\n");
      out.write("                  입력해주세요.</span\r\n");
      out.write("                ></i\r\n");
      out.write("              >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear: both\"></div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 헬스케어 목표스펙 정보 입력창 -->\r\n");
      out.write("            <div id=\"time\">\r\n");
      out.write("              <label>목표 기간</label>\r\n");
      out.write("              <input type=\"date\" name=\"wantdate\" />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"goal\">\r\n");
      out.write("              <label>운동 목적</label>\r\n");
      out.write("              <select size=\"1\" name=\"wantgoal\" id=\"dropgoal\">\r\n");
      out.write("                <option value=\"벌크업\">벌크업</option>\r\n");
      out.write("                <option value=\"린매스업\">린매스업</option>\r\n");
      out.write("                <option value=\"컷팅\">컷팅</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("			<!-- 히든 (멤버 시퀀스 넘기기용) -->\r\n");
      out.write("			<input type=\"hidden\" name=\"memberseq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberseq }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <!-- 헬스케어 넘어가기 버튼 -->\r\n");
      out.write("            <div>\r\n");
      out.write("              <input\r\n");
      out.write("                type=\"submit\"\r\n");
      out.write("                value=\"입력확인\"\r\n");
      out.write("                name=\"bt2\"\r\n");
      out.write("                id=\"btn2\"\r\n");
      out.write("              />\r\n");
      out.write("              <input\r\n");
      out.write("                type=\"button\"\r\n");
      out.write("                value=\"기록보기\"\r\n");
      out.write("                name=\"bt1\"\r\n");
      out.write("                id=\"btn1\"\r\n");
      out.write("                 onClick=\"location.href='/team3/specrecord/edit.do'\"\r\n");
      out.write("              />\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 헬스케어 넘어가기 버튼 자바스크립트 -->\r\n");
      out.write("    <script>\r\n");
      out.write("      var txtweight = document.healthcare_want_form.txtweight;\r\n");
      out.write("      var txtfat = document.healthcare_want_form.txtfat;\r\n");
      out.write("      var txtmuscle = document.healthcare_want_form.txtmuscle;\r\n");
      out.write("      var txttime = document.healthcare_want_form.txttime;\r\n");
      out.write("      var txtgoal = document.healthcare_want_form.txtgoal;\r\n");
      out.write("\r\n");
      out.write("      var bt2 = document.healthcare_want_form.bt2;\r\n");
      out.write("\r\n");
      out.write("      bt2.onclick = m2;\r\n");
      out.write("\r\n");
      out.write("      function m2() {\r\n");
      out.write("        for (var i = 0; i < txtweight.value.length; i++) {\r\n");
      out.write("          var c = txtweight.value.charAt(i);\r\n");
      out.write("          if (c < \"0\" || c > \"9\") {\r\n");
      out.write("            alert(\"체중은 숫자만 입력해주세요.\");\r\n");
      out.write("            txtweight.focus();\r\n");
      out.write("            return;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (txtweight.value.trim() == \"\") {\r\n");
      out.write("          alert(\"체중을 입력해주세요.\");\r\n");
      out.write("          txtweight.focus();\r\n");
      out.write("          return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < txtfat.value.length; i++) {\r\n");
      out.write("          var c = txtfat.value.charAt(i);\r\n");
      out.write("          if (c < \"0\" || c > \"9\") {\r\n");
      out.write("            alert(\"체지방량은 숫자만 입력해주세요.\");\r\n");
      out.write("            txtfat.focus();\r\n");
      out.write("            return;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (txtfat.value.trim() == \"\") {\r\n");
      out.write("          alert(\"체지방량을 입력해주세요.\");\r\n");
      out.write("          txtfat.focus();\r\n");
      out.write("          return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < txtmuscle.value.length; i++) {\r\n");
      out.write("          var c = txtmuscle.value.charAt(i);\r\n");
      out.write("          if (c < \"0\" || c > \"9\") {\r\n");
      out.write("            alert(\"근육량은 숫자만 입력해주세요.\");\r\n");
      out.write("            txtmuscle.focus();\r\n");
      out.write("            return;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (txtmuscle.value.trim() == \"\") {\r\n");
      out.write("          alert(\"근육량을 입력해주세요.\");\r\n");
      out.write("          txtmuscle.focus();\r\n");
      out.write("          return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < txttime.value.length; i++) {\r\n");
      out.write("          var c = txttime.value.charAt(i);\r\n");
      out.write("          if (c < \"0\" || c > \"9\") {\r\n");
      out.write("            alert(\"운동 기간은 숫자만 입력해주세요.\");\r\n");
      out.write("            txttime.focus();\r\n");
      out.write("            return;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (txttime.value.trim() == \"\") {\r\n");
      out.write("          alert(\"목표 기간을 입력해주세요.\");\r\n");
      out.write("          txttime.focus();\r\n");
      out.write("          return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        document.healthcare_want_form.submit();\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
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