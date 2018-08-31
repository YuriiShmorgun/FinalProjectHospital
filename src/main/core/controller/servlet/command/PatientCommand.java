package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class PatientCommand implements ICommand{
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/util/patient/patient.jsp";
    }
}
