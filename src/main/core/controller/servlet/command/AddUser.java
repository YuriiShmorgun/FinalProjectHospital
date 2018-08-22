package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class AddUser implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        return "redirect:/util/administrator/addUser.jsp";
    }
}
