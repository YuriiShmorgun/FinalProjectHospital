package controller.servlet.command;




import javafx.scene.control.Alert;
import model.entity.Role;
import model.entity.User;
import model.service.LoginServise;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginCommand implements ICommand {


    private Map<Role, String> pathCommandHashMap = new HashMap<>();




    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session= request.getSession(false);

        if (login == null || login.equals("") || password == null || password.equals("")) {
            return "index.jsp";
        }


  //      UtilityCommand.checkUserIsLogged(request, login);


        if (request.getSession().getServletContext().getAttribute(login) != null){
                     System.out.println((HttpSession)request.getServletContext().getAttribute(login));
           ((HttpSession) request.getSession().getServletContext().getAttribute(login)).invalidate();
        }
        request.getSession().getServletContext().setAttribute(login, request.getSession());
                     System.out.println(request.getServletContext().getAttribute(login));

        pathCommandHashMap.put(Role.ADMINISTRATOR, "redirect:/administrator");
        pathCommandHashMap.put(Role.DOCTOR, "redirect:/doctor");
      //  pathCommandHashMap.put(Role.ADMINISTRATOR, "redirect:/administrator");
      //  pathCommandHashMap.put(Role.ADMINISTRATOR, "redirect:/administrator");




        try {
            LoginServise loginServise = new LoginServise();

            User user = loginServise.getUser(login, password);
            Role role = user.getRole();
            session.setAttribute("user", user);
            session.setAttribute("role", role);



           // return "redirect:/administrator";
            System.out.println(role);
         /*   ICommand pathCommand = pathCommandHashMap.get(role);*/
            return pathCommandHashMap.get(role);
        }catch (Exception e){
            return "index.jsp";
        }

















            /*===============================================================*/
         /*   LoginServise loginServise = new LoginServise();
            Role role = loginServise.getUser(login, password).getRole();



            String path = role.toString();

            System.out.println("Role = " + path);

            return (String) PathMapper.getPathMap().get(role.toString());
            //return "redirect:/util/administrator/administrator.jsp";
*/

        }
    }





