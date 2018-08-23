package controller.servlet.command;

import model.entity.User;
import model.service.PatientService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class PatientListCommand implements ICommand{
    @Override
    public String execute(HttpServletRequest request) {
        List<User> patientList = new PatientService().getAllPatient();
        request.setAttribute("patientList", patientList);
        return "/util/administrator/patientList.jsp";
    }
}
