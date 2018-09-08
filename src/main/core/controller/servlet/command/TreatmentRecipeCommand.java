package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class TreatmentRecipeCommand implements ICommand{
    @Override
    public String execute(HttpServletRequest request) {








        return "/WEB-INF/util/doctor/treatmentRecipe.jsp";
    }
}
