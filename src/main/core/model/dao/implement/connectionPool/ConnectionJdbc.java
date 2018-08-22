package model.dao.implement.connectionPool;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionJdbc {

    private Connection connection;
    private InitialContext initialContext;



    public Connection getConnection() {
        return connection;
    }

    public ConnectionJdbc(){
        try {
            initialContext = new InitialContext();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public void init(){

    }

    public void openAccess(){
        try {
            Context context = (Context) initialContext.lookup("java:comp/env");
            DataSource dataSource = (DataSource) context.lookup("jdbc/root");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
