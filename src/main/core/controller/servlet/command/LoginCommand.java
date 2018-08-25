package controller.servlet.command;



import model.entity.Role;
import model.service.LoginServise;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginCommand implements ICommand {







    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session= request.getSession();


        if (login == null || login.equals("") || password == null || password.equals("")) {
            return "/login.jsp";


        }else if (login.equals("admin") || password.equals("qwerty")) {
            request.getSession().setAttribute("role", Role.ADMINISTRATOR );

            LoginServise loginServise = new LoginServise();
            Role role = loginServise.getUser(login, password).getRole();

            System.out.println("Role = " + role);


            return PathMapper.getPathMap().get(role).toString();


        }
        else {
            return "list.jsp";
        }
    }
}







               /* LoginServise loginServise = new LoginServise();
                Role role = loginServise.getUser(login, password).getRole();
                return "redirect:/util/administrator/administrator.jsp";
*/