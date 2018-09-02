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

        commands.put("/sortByTitle", new SortByTitle());
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
        //System.out.println(ICommand.getClass().getName());
        String page = ICommand.execute(request);




        if (page.contains("redirect:")){
            response.sendRedirect(request.getContextPath() + page.replace("redirect:", ""));
        } else {
            request.getRequestDispatcher(page).forward(request, response);
        }
        //request.getRequestDispatcher(page).forward(request,response);
    }




}


/*

в базе хранить хешкод
какие патерны
какие синглтон ленивый основной дабл чек

депенденси энжексн  инверсион контрол -

в 8 джаве абстраные класы об интерфеса

хеш сет от хеш мап
котнракт еквлс хеш код

в логин свой ексепшн




*/