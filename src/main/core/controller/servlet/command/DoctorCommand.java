package controller.servlet.command;

import model.entity.User;
import model.service.LoadAllUsersService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class DoctorCommand implements ICommand {
    LoadAllUsersService loadAllUsersService = new LoadAllUsersService();
    @Override
    public String execute(HttpServletRequest request) {

        List<User> userList = loadAllUsersService.getAllUsers();

        request.setAttribute("userList", userList);
        return "/WEB-INF/util/doctor/doctor.jsp";
    }
}
