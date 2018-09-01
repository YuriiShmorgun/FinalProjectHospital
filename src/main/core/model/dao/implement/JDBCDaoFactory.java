package model.dao.implement;

import model.dao.*;
import model.dao.implement.connectionPool.ConnectionPoolHolder;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

    private DataSource dataSource = ConnectionPoolHolder.getDataSource();

    public JDBCDaoFactory() {
    }

    @Override
    public IGuestDao createIGuestDao() {
        return null;
    }

    @Override
    public IAdministratorDao createIAdministratorDao() {

        dataSource = ConnectionPoolHolder.getDataSource();
        return new JDBCAdministratorDao(getConnection());


    }

    @Override
    public IPatientDao createIPatientDao() {


        return null;
    }

    @Override
    public INurseDao createINurseDao() {
        return null;
    }

    @Override
    public IDoctorDao createIDoctorDao() {
        dataSource = ConnectionPoolHolder.getDataSource();
        return new JDBCDoctorDao(getConnection());
    }

    @Override
    public IWriteOutPatientDao createIWriteOutPatientDao() {
        return null;
    }

    @Override
    public ISystemDao createISystemDao() {
        dataSource = ConnectionPoolHolder.getDataSource();
        return new JDBCSystemDao(getConnection());
    }


    private Connection getConnection(){
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }













}
