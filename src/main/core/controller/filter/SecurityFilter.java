package controller.filter;



import model.entity.Role;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        String servletPath = request.getServletPath();
        Role role = (Role) session.getAttribute("role");

        if (servletPath.contains("index")||
                servletPath.contains("login")||
                servletPath.contains("sour")||
                servletPath.contains("boot")||
                servletPath.contains("favicon")||
                servletPath.contains("css")){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( (servletPath.contains("administrator")) && role==Role.ADMINISTRATOR){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( (servletPath.contains("doctor")) && role==Role.DOCTOR){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( (servletPath.contains("nurse")) && role==Role.NURSE){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if ( (servletPath.contains("patient")) && role==Role.PATIENT) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else if ( (servletPath.contains("patient")) && role==Role.WRITE_OUT_PATIENT) {
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            servletResponse.getWriter().append("AccessDenied");
            return;
        }
    }



    @Override
    public void destroy() {

    }
}
