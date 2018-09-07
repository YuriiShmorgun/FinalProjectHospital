package controller.servlet.command;

import model.entity.User;

import javax.servlet.http.HttpServletRequest;

public class LogOutCommand implements ICommand {

    @Override
    public String execute(HttpServletRequest request) {


        User user = (User) request.getSession().getAttribute("user");


        request.getSession().getServletContext().removeAttribute(user.getLogin());
        request.getSession().invalidate();

        return "redirect:index.jsp";





    }
}
