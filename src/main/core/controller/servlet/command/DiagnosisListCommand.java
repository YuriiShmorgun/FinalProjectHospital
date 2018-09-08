package controller.servlet.command;

import model.entity.DiagnosesInfo;
import model.entity.User;
import model.service.FindAllByIdService;
import model.service.IdFindUserServise;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public class DiagnosisListCommand implements ICommand {


    IdFindUserServise idFindUserServise = new IdFindUserServise();
    FindAllByIdService findAllByIdService = new FindAllByIdService();

    @Override
    public String execute(HttpServletRequest request) {
        if ((request.getParameter("patient_id")) != null) {
            request.getSession().setAttribute("patient_id", Integer.parseInt(request.getParameter("patient_id")));
        }

        User user = idFindUserServise.getById((Integer) request.getSession().getAttribute("patient_id"));
        List<DiagnosesInfo> diagnosesInfoList = findAllByIdService.findPatientDiagnoses((Integer) request.getSession().getAttribute("patient_id"));

        request.getSession().setAttribute("patient", user);
        request.setAttribute("diagnosesInfoList", diagnosesInfoList);
        return "/WEB-INF/util/doctor/diagnosisList.jsp";
    }
}
