package controller.servlet.command;




import model.entity.Role;
import model.entity.User;

import javax.servlet.http.HttpServletRequest;


public class AddUserCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/util/administrator/addUser.jsp";

    }
}
