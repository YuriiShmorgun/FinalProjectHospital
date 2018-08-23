package model.dao.implement.connectionPool;



import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }




    public void init (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root", "root" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ConnectionJdbc() {
        try {
            initialContext = new InitialContext();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    private InitialContext initialContext;

    public Connection openAccess(){
        try {
            Context context = (Context) initialContext.lookup("java:comp/env");
            DataSource dataSource = (DataSource) context.lookup("jdbc/root");
            return dataSource.getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




    public void close (){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /* private Connection connection;
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
    }*/
}
