package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class AddServiceCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {

            return "/WEB-INF/util/administrator/addService.jsp";

    }
}
