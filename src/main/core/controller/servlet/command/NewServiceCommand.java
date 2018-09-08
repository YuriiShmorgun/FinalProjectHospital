package controller.servlet.command;

import model.entity.Procedure;
import model.entity.Type;
import model.service.CreateProcedureServise;


import javax.servlet.http.HttpServletRequest;

public class NewServiceCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        Procedure procedure = new Procedure.Builder()
                .setProcedure_uk(request.getParameter("procedure_uk"))
                .setProcedure_en(request.getParameter("procedure_en"))
                .setType(Type.valueOf(request.getParameter("type").toUpperCase()))
                .build();

        new CreateProcedureServise().addProcedure(procedure);
        return "redirect:/administrator";
    }
}
