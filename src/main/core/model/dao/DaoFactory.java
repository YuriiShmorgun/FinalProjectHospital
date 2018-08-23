package model.dao;


import model.dao.implement.JDBCDaoFactory;

public abstract class DaoFactory {

    public static DaoFactory daoFactory;

    public abstract IGuestDao createIGuestDao();
    public abstract IAdministratorDao createIAdministratorDao();
    public abstract IPatientDao createIPatientDao();
    public abstract INurseDao createINurseDao();
    public abstract IDoctorDao createIDoctorDao();
    public abstract IWriteOutPatientDao createIWriteOutPatientDao();
    public abstract ISystemDao createISystemDao();

    public static DaoFactory getInstance(){
        if (daoFactory == null){
            synchronized (DaoFactory.class){
                if (daoFactory==null){
                    DaoFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}




