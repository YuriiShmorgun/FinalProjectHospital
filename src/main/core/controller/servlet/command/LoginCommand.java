package controller.servlet.command;

import model.entity.Role;
import model.entity.User;
import model.service.LoginServise;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Pattern;


public class LoginCommand implements ICommand {

    private Map<Role, String> pathCommandHashMap = new HashMap<>();

    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session= request.getSession(false);

        if (!(new CheckLogin().check(login, password, request))){
            return "index.jsp";
        }

        pathCommandHashMap.put(Role.ADMINISTRATOR, "redirect:/administrator");
        pathCommandHashMap.put(Role.DOCTOR, "redirect:/doctor");

        try {
            LoginServise loginServise = new LoginServise();
            User user = loginServise.getUser(login, password);
            Role role = user.getRole();
            session.setAttribute("user", user);
            session.setAttribute("role", role);
            return pathCommandHashMap.get(role);
        }catch (Exception e){
            return "index.jsp";
        }
    }
}



