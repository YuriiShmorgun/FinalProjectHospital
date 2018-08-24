package controller.servlet.command;



import model.entity.Role;
import model.service.LoginServise;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginCommand implements ICommand {


    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session= request.getSession();


        if (login == null || login.equals("") || password == null || password.equals("")) {
            //System.out.println("Not");
            return "/index.jsp";


        } else
            try {
                LoginServise loginServise = new LoginServise();
                Role role = loginServise.getUser(login, password).getRole();
                System.out.println("ROLE = " + role);
                return "redirect:/util/administrator/administrator.jsp";
            }catch (Exception e){

            }
            /*if (login.equals("admin") || password.equals("qwerty")) {
            session.setAttribute("role", Role.ADMINISTRATOR);
*/





        return "/index.jsp";
        }
}