package controller.servlet.command;


import model.dao.implement.connectionPool.ConnectionJdbc;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddUser implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {


        ConnectionJdbc connectionJdbc = new ConnectionJdbc();
        connectionJdbc.init();

        Connection connection = connectionJdbc.getConnection();


        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM hospitaldb.user;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                System.out.println(resultSet.getString("name_en"));
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }


        connectionJdbc.close();






        return "redirect:/util/administrator/addUser.jsp";
    }
}
