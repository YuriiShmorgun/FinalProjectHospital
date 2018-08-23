package model.dao.implement;

import model.dao.ISystemDao;
import model.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class JDBCSystemDao implements ISystemDao {

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



        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM hospitaldb.user WHERE login = 'doc' and password = 'q';");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name_uk"));
                System.out.println("+++++++++++++++++++++++++++++Работет ++++++++++++++++");
            }
        }catch (Exception e){

        }



      //  SELECT * FROM hospitaldb.user WHERE login = 'doc' and password = 'q';






        return null;
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

    }
}
