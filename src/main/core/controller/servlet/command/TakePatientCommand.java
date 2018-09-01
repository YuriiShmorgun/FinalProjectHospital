package controller.servlet.command;

import model.entity.User;
import model.service.IdFindUserServise;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class TakePatientCommand implements ICommand {

    IdFindUserServise idFindUserServise = new IdFindUserServise();

    @Override
    public String execute(HttpServletRequest request) {

        System.out.println(Integer.parseInt(request.getParameter("id")));
        User user = idFindUserServise
                .getById(Integer.parseInt(request.getParameter("id")));


        request.setAttribute("user", user);

        return "/WEB-INF/util/doctor/takePatient.jsp";
    }
}
