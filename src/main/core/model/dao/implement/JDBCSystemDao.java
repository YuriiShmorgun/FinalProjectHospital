package model.dao.implement;

import model.dao.ISystemDao;
import model.entity.Role;
import model.entity.User;

import java.sql.*;
import java.util.List;
import java.util.ResourceBundle;

public class JDBCSystemDao implements ISystemDao {

    ResourceBundle dbBundle = ResourceBundle.getBundle("dbRequest");
    Connection connection;

    public JDBCSystemDao(Connection connection){
        this.connection = connection;
    }



    @Override
    public void create(User entity) {

    }

    @Override
    public User findById(int idInt) {
        return null;
    }

    @Override
    public User findByLoginPassword(String login, String password) {

        System.out.println(login);
        System.out.println(password);

        String sql = "SELECT * FROM hospitaldb.user WHERE login = ? and password = ?;";
        int result = 0;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();


            resultSet.next();


                User user = new User.Builder()
                        .setId(resultSet.getInt(dbBundle.getString("ID_USER")))
                        .setLogin(resultSet.getString(dbBundle.getString("LOGIN")))
                        .setPassword(resultSet.getString(dbBundle.getString("PASSWORD")))
                        .setName_uk(resultSet.getString(dbBundle.getString("NAME_UK")))
                        .setName_en(resultSet.getString(dbBundle.getString("NAME_EN")))
                        .setSurname_uk(resultSet.getString(dbBundle.getString("SURNAME_UK")))
                        .setSurname_en(resultSet.getString(dbBundle.getString("SURNAME_EN")))
                        .setRole(Role.valueOf(resultSet.getString(dbBundle.getString("ROLE"))))
                        .build();

              //  System.out.println(user);


            return user;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
