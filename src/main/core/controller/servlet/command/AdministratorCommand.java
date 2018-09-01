package controller.servlet.command;

import model.entity.User;
import model.service.LoadAllUsersService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class AdministratorCommand implements ICommand {
    LoadAllUsersService loadAllUsersService = new LoadAllUsersService();

    @Override
    public String execute(HttpServletRequest request) {





    List <User> userList = loadAllUsersService.getAllUsers();

    request.setAttribute("userList", userList);


  //  return "redirect:/administrator";
    return "/WEB-INF/util/administrator/administrator.jsp";

    }
}
