package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class DoctorCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/util/doctor/doctor.jsp";
    }
}
