package controller.servlet.command;

import model.entity.User;
import model.service.LoadAllUsers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

public class AdministratorCommand implements ICommand {
    LoadAllUsers loadAllUsers = new LoadAllUsers();

    @Override
    public String execute(HttpServletRequest request) {





    List <User> userList = loadAllUsers.getAllUsers();

    request.setAttribute("userList", userList);

    for (User user: userList){
        System.out.println(user.getLogin());
        }

    return "/WEB-INF/util/administrator/administrator.jsp";

    }
}
