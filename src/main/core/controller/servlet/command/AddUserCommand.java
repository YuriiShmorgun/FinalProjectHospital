package controller.servlet.command;


import javax.servlet.http.HttpServletRequest;


public class AddUserCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/util/administrator/addUser.jsp";
    }
}
