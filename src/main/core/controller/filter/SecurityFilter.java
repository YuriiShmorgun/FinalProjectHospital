package controller.filter;



import model.entity.Role;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SecurityFilter implements Filter {


    public static List<String> commonList = new ArrayList();
    public static List<String> adminList = new ArrayList();
    public static List<String> doctorList = new ArrayList();
    public static List<String> nurseList = new ArrayList();
    public static List<String> patientList = new ArrayList();


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        commonList.add("/index.jsp");
        commonList.add("/login");
        commonList.add("/bootstrap/fonts/glyphicons-halflings-regular.ttf");
        commonList.add("/bootstrap/fonts/glyphicons-halflings-regular.woff");
        commonList.add("/source/bootstrap/js/bootstrap.min.js");
        commonList.add("/favicon.ico");
        commonList.add("/logout");
        commonList.add("../../bootstrap/css/bootstrap.min.css");
        commonList.add("../../css/styles.css");
        commonList.add("../element/footer.jsp");

        adminList.add("/administrator");
        adminList.add("/addUser");
        adminList.add("/addService");
        adminList.add("/addService");
        adminList.add("/addService");
        adminList.add("/addService");

        doctorList.add("/takePatient");
        doctorList.add("/diagnosisList");
        doctorList.add("/doctor");
        doctorList.add("/treatmentRecipe");


    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        String servletPath = request.getServletPath();
        Role role = (Role) session.getAttribute("role");

        if (commonList.contains(servletPath)){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( adminList.contains(servletPath)  && role==Role.ADMINISTRATOR){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( doctorList.contains(servletPath) && role==Role.DOCTOR){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( nurseList.contains(servletPath) && role==Role.NURSE){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( patientList.contains(servletPath) && role==Role.PATIENT) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletResponse.getWriter().append("AccessDenied");
            return;
        }
    }


    @Override
    public void destroy() {

    }
}
