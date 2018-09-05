package model.dao.implement;

import model.dao.IAdministratorDao;
import model.entity.Procedure;
import model.entity.Role;
import model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        if (entity instanceof User){



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

        if (entity instanceof Procedure) {
            System.out.println("Im Procedure ++++++++++++++++++++++++++");


            String sql = "INSERT INTO hospitaldb.procedure (procedure_uk, procedure_en, type) VALUE(? ,?, ?);";
            Procedure procedure = (Procedure) entity;

            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, procedure.getProcedure_uk());
                preparedStatement.setString(2, procedure.getProcedure_en());
                preparedStatement.setString(3, procedure.getType().toString());
                preparedStatement.execute();
            } catch (SQLException e) {

            }
        }
    }

    @Override
    public Object findById(int idInt) {
        return null;
    }


    @Override
    public List findAll() {
        String sql = "SELECT * FROM hospitaldb.user ;";
        List<User> userList = new ArrayList();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {


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



             userList.add(user);

            }
        }catch (SQLException  e){

        }
        return userList;
    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close()  {

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }
}
