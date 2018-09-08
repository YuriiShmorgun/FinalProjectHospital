package controller.servlet;



import controller.servlet.command.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Servlet extends HttpServlet {


    private Map<String, ICommand> commands = new HashMap<>();

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);


        commands.put("/login", new LoginCommand());
        commands.put("/addUser", new AddUserCommand());
        commands.put("/logout", new LogOutCommand());
        commands.put("/newUser", new NewUserCommand());
        commands.put("/administrator", new AdministratorCommand());
        commands.put("/addService", new AddServiceCommand());
        commands.put("/newService", new NewServiceCommand());
        commands.put("/doctor", new DoctorCommand());
        commands.put("/takePatient", new TakePatientCommand());
        commands.put("/newDiagnosis", new NewDiagnosisCommand());
        commands.put("/diagnosisList", new DiagnosisListCommand());
        commands.put("/treatmentRecipe", new TreatmentRecipeCommand());
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGetDoPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGetDoPost(request, response);
    }



    private void doGetDoPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getRequestURI();
        ICommand ICommand = commands.getOrDefault(path , (r)->"/index.jsp");
        String page = ICommand.execute(request);

        if (page.contains("redirect:")){
            response.sendRedirect(request.getContextPath() + page.replace("redirect:", ""));
        } else {
            request.getRequestDispatcher(page).forward(request, response);
        }
    }
}

