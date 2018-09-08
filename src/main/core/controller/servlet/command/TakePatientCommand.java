package controller.servlet.command;

import model.entity.User;
import model.service.IdFindUserServise;
import javax.servlet.http.HttpServletRequest;

public class TakePatientCommand implements ICommand {

    IdFindUserServise idFindUserServise = new IdFindUserServise();

    @Override
    public String execute(HttpServletRequest request) {

        if ((request.getParameter("patient_id")) != null) {
            request.getSession().setAttribute("patient_id", Integer.parseInt(request.getParameter("patient_id")));
        }

        User user = idFindUserServise.getById((Integer) request.getSession().getAttribute("patient_id"));
        request.getSession().setAttribute("patient", user);
        return "/WEB-INF/util/doctor/takePatient.jsp";
    }
}
