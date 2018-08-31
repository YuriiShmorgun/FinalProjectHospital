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
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String servletPath = request.getServletPath();
        Role role = (Role) session.getAttribute("role");

        if (role == null){
            response.sendRedirect("/index.jsp");
        }
        if (servletPath.matches("doctor") && (role != Role.DOCTOR)){
            response.sendRedirect("/logout");
        }



       /* if (!((String)((HttpServletRequest) servletRequest).getSession()
                .getAttribute("login")).matches(("(?=^\\.{8,}\\$\\)((?=.*\\d)|(?=.*\\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$)"))){
            response.sendRedirect("/index.jsp");
        }*/




        filterChain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }
}
