package controller.servlet.command;

import model.entity.Diagnoses;
import model.entity.User;
import model.service.CreateDiagnosesService;

import javax.servlet.http.HttpServletRequest;

public class NewDiagnosisCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {

        Diagnoses diagnoses = new Diagnoses.Builder()
                .setProcedure_uk(request.getParameter("diagnosis_ua"))
                .setProcedure_en(request.getParameter("diagnosis_en"))
                .setDoctor_id(((User)request.getSession().getAttribute("user")).getId())
                .setPatient_id(((User)request.getSession().getAttribute("patient")).getId())
                .build();

        System.out.println(diagnoses);

        CreateDiagnosesService createDiagnosesService = new CreateDiagnosesService();
        createDiagnosesService.addDiagnoses(diagnoses);

        return "redirect:/doctor";
    }
}
