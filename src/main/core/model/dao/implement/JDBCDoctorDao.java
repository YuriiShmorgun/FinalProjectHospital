package model.dao.implement;

import model.dao.DaoFactory;
import model.dao.IAdministratorDao;
import model.dao.IDoctorDao;
import model.entity.Diagnoses;
import model.entity.DiagnosesInfo;
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

    @Override
    public List findAllById(int id) {

        List<DiagnosesInfo> diagnosesInfoList = new ArrayList();

        String sql = "SELECT hospitaldb.diagnosis.iddiagnosis,  " +
                "hospitaldb.diagnosis.diagnosis_uk, " +
                "hospitaldb.diagnosis.diagnosis_en, " +
                "hospitaldb.user.name_uk,  " +
                "hospitaldb.user.name_en,  " +
                "hospitaldb.user.surname_uk,  " +
                "hospitaldb.user.surname_en  " +

                "FROM hospitaldb.diagnosis INNER JOIN hospitaldb.user  " +
                "ON hospitaldb.diagnosis.id_doctor = hospitaldb.user.iduser  " +
                "WHERE hospitaldb.diagnosis.id_patient = ?;";



            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,id);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {


                    DiagnosesInfo diagnosesInfo = new DiagnosesInfo.Builder()
                            .setId(resultSet.getInt("iddiagnosis"))
                            .setDiagnoses_uk(resultSet.getString("diagnosis_uk"))
                            .setDiagnoses_en(resultSet.getString("diagnosis_en"))
                            .setDoctorName_uk(resultSet.getString("name_uk"))
                            .setDoctorName_en(resultSet.getString("name_en"))
                            .setDoctorSurname_uk(resultSet.getString("surname_uk"))
                            .setDoctorSurname_en(resultSet.getString("surname_en"))
                            .build();

                    diagnosesInfoList.add(diagnosesInfo);

                }
            }catch (SQLException e){

            };

                return diagnosesInfoList;
    }

    public JDBCDoctorDao (Connection connection){
        this.connection = connection;
    }

    ResourceBundle dbBundle = ResourceBundle.getBundle("dbRequest");
    Connection connection = null;

    User user =null;


    @Override
    public void create(Object entity) {


        if (entity instanceof Diagnoses) {



            String sql = "INSERT INTO hospitaldb.diagnosis (diagnosis_uk, diagnosis_en, id_patient, id_doctor, cured) VALUE (?, ?, ?, ?, ?);";



            Diagnoses diagnoses = (Diagnoses) entity;

            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, diagnoses.getDiagnoses_uk());
                preparedStatement.setString(2, diagnoses.getDiagnoses_en());
                preparedStatement.setInt(3, diagnoses.getPatient_id());
                preparedStatement.setInt(4, diagnoses.getDoctor_id());
                preparedStatement.setInt(5, 0);


                preparedStatement.execute();

                System.out.println("записался !!!!!!!!!!!!!!!!!!!!!!!!!");

            }catch (SQLException e){
                System.err.println("Не записался !!!!!!!!!!!!!!!!!!!!!!!!!");
            }


        }











    }

    @Override
    public Object findById(int idInt) {


        String sql = "SELECT * FROM hospitaldb.user WHERE role = 'Patient'AND iduser = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,idInt);
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();


                User userFromSQL = new User.Builder()
                        .setId(resultSet.getInt(dbBundle.getString("ID_USER")))
                        .setLogin(resultSet.getString(dbBundle.getString("LOGIN")))
                        .setName_uk(resultSet.getString(dbBundle.getString("NAME_UK")))
                        .setName_en(resultSet.getString(dbBundle.getString("NAME_EN")))
                        .setSurname_uk(resultSet.getString(dbBundle.getString("SURNAME_UK")))
                        .setSurname_en(resultSet.getString(dbBundle.getString("SURNAME_EN")))
                        .setRole(Role.valueOf(resultSet.getString(dbBundle.getString("ROLE"))))
                        .build();
                user = userFromSQL;






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
