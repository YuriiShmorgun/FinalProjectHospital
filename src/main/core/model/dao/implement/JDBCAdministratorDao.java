package model.dao.implement;

import model.dao.IAdministratorDao;
import model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class JDBCAdministratorDao implements IAdministratorDao {


    public JDBCAdministratorDao (Connection connection){
        this.connection = connection;
    }

    ResourceBundle dbBundle = ResourceBundle.getBundle("dbRequest");
    Connection connection = null;


    @Override
    public void create(Object entity) {
        String sql = "INSERT INTO hospitaldb.user (login, password, role, name_uk, name_en, surname_uk, surname_en) VALUES(?, ?, ?, ?, ?, ?, ?);";

        User user = (User) entity;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole().toString());
            preparedStatement.setString(4, user.getName_uk());
            preparedStatement.setString(5, user.getName_en());
            preparedStatement.setString(6, user.getSurname_uk());
            preparedStatement.setString(7, user.getSurname_en());

            preparedStatement.execute();

            System.out.println("записался !!!!!!!!!!!!!!!!!!!!!!!!!");

        }catch (SQLException e){
            System.err.println("Не записался !!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }

    @Override
    public Object findById(int idInt) {
        return null;
    }


    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
