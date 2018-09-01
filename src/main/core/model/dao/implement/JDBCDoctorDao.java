package model.dao.implement;

import model.dao.DaoFactory;
import model.dao.IAdministratorDao;
import model.dao.IDoctorDao;
import model.entity.Role;
import model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class JDBCDoctorDao implements IDoctorDao {

    public JDBCDoctorDao (Connection connection){
        this.connection = connection;
    }

    ResourceBundle dbBundle = ResourceBundle.getBundle("dbRequest");
    Connection connection = null;

    User user =null;


    @Override
    public void create(Object entity) {





    }

    @Override
    public Object findById(int idInt) {

        System.out.println(idInt);
        String sql = "SELECT * FROM hospitaldb.user WHERE role = 'Patient'AND iduser = 4;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {


                User userFromSQL = new User.Builder()
                        .setId(resultSet.getInt(dbBundle.getString("ID_USER")))
                        .setLogin(resultSet.getString(dbBundle.getString("LOGIN")))
                        .setName_uk(resultSet.getString(dbBundle.getString("NAME_UK")))
                        .setName_en(resultSet.getString(dbBundle.getString("NAME_EN")))
                        .setSurname_uk(resultSet.getString(dbBundle.getString("SURNAME_UK")))
                        .setSurname_en(resultSet.getString(dbBundle.getString("SURNAME_EN")))
                        .setRole(Role.valueOf(resultSet.getString("PATIENT")))
                        .build();
                user = userFromSQL;
            }





        } catch (SQLException e) {
            e.printStackTrace();
        }


        return user;
    }
    /*String sql = "SELECT * FROM hospitaldb.user WHERE role = 'PATIENT';";*/
    @Override
    public List findAll() {

        String sql = "SELECT * FROM hospitaldb.user WHERE role = 'PATIENT';";
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
