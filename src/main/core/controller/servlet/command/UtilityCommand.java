package controller.servlet.command;

import model.entity.Role;
import model.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashSet;

public class UtilityCommand {
    static void setUserRole(HttpServletRequest request, Role role, User user){
        HttpSession session = request.getSession();
        ServletContext context = request.getServletContext();

        context.setAttribute("user", user);
        session.setAttribute("role", role);
    }



        public static void checkUserIsLogged(HttpServletRequest request, String userLogin){

        request.getSession().setAttribute("userLogin", userLogin);

        HashSet<HttpSession> sessionConteinerHashSet = (HashSet<HttpSession>) request.getSession()
                                                               .getServletContext()
                                                               .getAttribute("loggedUsers");

      /*  try {
            for(SessionConteiner sessionConteiner : sessionConteinerHashSet){
                if (sessionConteiner.getLogin().equals(userLogin)){
                    sessionConteiner.getSession().invalidate();
                    sessionConteinerHashSet.remove(sessionConteiner);
                }
            }
        } catch (Exception e ){}
*/


        request.getSession().getServletContext().setAttribute("loggedUsers", request.getSession());


    }

}
