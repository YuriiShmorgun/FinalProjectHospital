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

        System.out.println("Роль командира = " + role);

        if (role==Role.ADMINISTRATOR){
            /*RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/util/administrator/administrator.jsp");
            dispatcher.forward(request, response);
            */

        }


        filterChain.doFilter(request, response);










    }

    @Override
    public void destroy() {

    }
}
