package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class LogOutCommand implements ICommand {

    @Override
    public String execute(HttpServletRequest request) {
        request.getSession().setAttribute("role", null );
        return "redirect:index.jsp";
    }
}
