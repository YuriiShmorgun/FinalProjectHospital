package controller.servlet.command;

import model.entity.Procedure;
import model.entity.Role;
import model.entity.Type;
import model.entity.User;
import model.service.CreateProcedureServise;
import model.service.CreateUserServise;

import javax.servlet.http.HttpServletRequest;

public class NewServiceCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        Procedure procedure = new Procedure.Builder()
                .setProcedure_uk(request.getParameter("procedure_uk"))
                .setProcedure_en(request.getParameter("procedure_en"))
                .setType(Type.valueOf(request.getParameter("type").toUpperCase()))
                .build();
        ;

        System.out.println("NewProcedureType " + request.getParameter("type"));
        System.out.println("NewProcedure"  + procedure);


        CreateProcedureServise createProcedureServise = new CreateProcedureServise();
        createProcedureServise.addProcedure(procedure);

        return "/administrator";
    }
}
