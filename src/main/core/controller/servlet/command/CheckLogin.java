package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

public class CheckLogin {


    public boolean check (String login, String password, HttpServletRequest request){

        if (login == null || login.equals("") || password == null || password.equals("")) {
            return false;
        }

        if (!(Pattern.matches("^[a-zA-Z0-9]+$", login))
                || !(Pattern.matches("^[a-zA-Z0-9]+$", password))){
            return false;
        }

        if (request.getSession().getServletContext().getAttribute(login) != null){
            ((HttpSession) request.getServletContext().getAttribute(login)).invalidate();
        }
        request.getSession().getServletContext().setAttribute(login, request.getSession());

        return true;
    }
}
