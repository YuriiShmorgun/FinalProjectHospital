package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class TakePatientCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/util/doctor/takePatient.jsp";
    }
}
