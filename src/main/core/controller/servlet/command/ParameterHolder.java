package controller.servlet.command;

import javax.servlet.http.HttpServletRequest;

public class ParameterHolder {

    public void hold (HttpServletRequest request, String parameter){
        if ((request.getParameter(parameter)) != null) {
            request.getSession().setAttribute(parameter, request.getParameter(parameter));
        }

    }
}
