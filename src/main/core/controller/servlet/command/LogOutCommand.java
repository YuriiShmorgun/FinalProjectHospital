package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogOutCommand implements ICommand {


    @Override
    public String execute(HttpServletRequest request) {

       /* HttpSession session = request.getSession(false);
        //if (session != null) {
        if (session == null) {
            *//*Map<String, Object> map = (Map<String, Object>) session.getServletContext().getAttribute("loginedUsers");
            if (session.getAttribute("login") != null && map.containsKey(session.getAttribute("login")))
                map.remove(session.getAttribute("login"));*//*
            *//*request.getSession().getServletContext().removeAttribute((String) session.getAttribute("login"));*//*
            session.invalidate();
        }*/


        if (request.getSession().getServletContext().getAttribute("login") != null){
            ((HttpSession) request.getSession().getServletContext().getAttribute("login")).invalidate();
        }

        return "redirect:index.jsp";
    }
}
