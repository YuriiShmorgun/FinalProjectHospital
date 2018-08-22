package controller.servlet.command;


import javax.servlet.http.HttpServletRequest;

public class SortByTitle implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {



        return "index.jsp";
    }
}
