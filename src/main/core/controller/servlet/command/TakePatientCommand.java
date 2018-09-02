package controller.servlet.command;

import model.entity.User;
import model.service.IdFindUserServise;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class TakePatientCommand implements ICommand {

    IdFindUserServise idFindUserServise = new IdFindUserServise();



    @Override
    public String execute(HttpServletRequest request) {

        if ((request.getParameter("id")) != null) {
            request.getSession().setAttribute("id", Integer.parseInt(request.getParameter("id")));
        }

        User user = idFindUserServise.getById((Integer) request.getSession().getAttribute("id"));

        System.out.println(user);

        request.setAttribute("user", user);
        return "/WEB-INF/util/doctor/takePatient.jsp";
    }
}
