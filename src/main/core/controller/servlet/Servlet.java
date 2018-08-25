package controller.servlet;



import controller.servlet.command.AddUser;
import controller.servlet.command.ICommand;
import controller.servlet.command.LoginCommand;
import controller.servlet.command.SortByTitle;

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
    public void init() throws ServletException {

        commands.put("/sortByTitle", new SortByTitle());
        commands.put("/login", new LoginCommand());
        commands.put("/addUser", new AddUser());

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




        if (page.contains("redirect")){
            response.sendRedirect(request.getContextPath() + page.replace("redirect:", ""));
        } else {
            request.getRequestDispatcher(page).forward(request, response);
        }
        //request.getRequestDispatcher(page).forward(request,response);
    }




}

