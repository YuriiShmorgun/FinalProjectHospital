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


    private Map<Role, ICommand> pathCommandHashMap = new HashMap<>();




    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session= request.getSession();


        if (login == null || login.equals("") || password == null || password.equals("")) {
            return "index.jsp";
        }


  //      UtilityCommand.checkUserIsLogged(request, login);

/*
        if (request.getServletContext().getAttribute(login) != null){
            ((HttpSession) request.getServletContext().getAttribute(login).).invalidate();
        }
        request.getServletContext().setAttribute(login, request.getSession());*/

        pathCommandHashMap.put(Role.ADMINISTRATOR, new AdministratorCommand());
        pathCommandHashMap.put(Role.DOCTOR, new DoctorCommand());
        pathCommandHashMap.put(Role.PATIENT, new PatientCommand());

      //  if (login.equals("admin") || password.equals("qwerty")) {
      //      request.getSession().setAttribute("role", Role.ADMINISTRATOR );

        try {
            LoginServise loginServise = new LoginServise();

            User user = loginServise.getUser(login, password);
            request.getSession().setAttribute("user", user);
            Role role = user.getRole();

            System.out.println(role);
            ICommand pathCommand = pathCommandHashMap.get(role);
            return pathCommand.execute(request);
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









        /*if (login.equals("admin") || password.equals("qwerty")) {
            request.getSession().setAttribute("role", Role.ADMINISTRATOR );

            // TODO: 27.08.2018  .getServletContext()

            */


/*


            System.out.println("Role = " + request.getSession().getServletContext().getAttribute(login));

        try{
            LoginServise loginServise = new LoginServise();


            User currentUser = loginServise.getUser(login, password);
            request.getSession().setAttribute("currentUser", currentUser);
            System.out.println(currentUser.getRole());
            PathMapper pathMapper = new PathMapper();



            String path = (String) (pathMapper.getPathMap().get(currentUser.getRole().toString()));

            System.out.println(path);

           // LoginServise loginServise = new LoginServise();
            Role role = loginServise.getUser(login, password).getRole();
            return "redirect:/util/administrator/administrator.jsp";

        }catch (Exception e){


            return "index.jsp";
        }
    }


}


*/





               /* LoginServise loginServise = new LoginServise();
                Role role = loginServise.getUser(login, password).getRole();
                return "redirect:/util/administrator/administrator.jsp";
*/