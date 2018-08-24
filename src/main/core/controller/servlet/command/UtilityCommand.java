package controller.servlet.command;

import model.entity.Role;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UtilityCommand {
    void setUserRole(HttpServletRequest request, Role role, String login){
        HttpSession session = request.getSession();
        ServletContext context = request.getServletContext();
        session.setAttribute("login", login);
        context.setAttribute("role", role);
    }



}
