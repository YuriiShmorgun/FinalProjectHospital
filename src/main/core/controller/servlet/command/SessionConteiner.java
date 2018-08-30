package controller.servlet.command;

import javax.servlet.http.HttpSession;

public class SessionConteiner {

    private String login;
    private HttpSession session;

    public String getLogin() {
        return login;
    }

    public HttpSession getSession() {
        return session;
    }

    public SessionConteiner(String login, HttpSession session) {
        this.login = login;
        this.session = session;
    }
}
