package controller.servlet.command;

import model.entity.User;

import javax.servlet.http.HttpServletRequest;

public class LogOutCommand implements ICommand {

    @Override
    public String execute(HttpServletRequest request) {
        request.getSession().setAttribute("user", null );
      //  request.getSession().invalidate();

        return "redirect:index.jsp";





    }
}
