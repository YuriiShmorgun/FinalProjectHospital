package controller.servlet.command;




import model.entity.Role;
import model.entity.User;

import javax.servlet.http.HttpServletRequest;


public class AddUser implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {


        User user = new User.Builder()

                .setLogin(request.getParameter("login"))
                .setPassword(request.getParameter("password"))
                .setName_uk(request.getParameter("name_uk"))
                .setName_en(request.getParameter("name_en"))
                .setSurname_uk(request.getParameter("surname_uk"))
                .setSurname_en(request.getParameter("surname_en"))
              //  .setRole(Role.valueOf(request.getParameter("role")))
                .build();


        System.out.println(user);

        return "redirect:/util/administrator/addUser.jsp";
    }
}
