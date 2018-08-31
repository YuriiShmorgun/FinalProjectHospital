package model.service;

import model.dao.DaoFactory;
import model.dao.IAdministratorDao;
import model.entity.Procedure;

public class CreateProcedureServise {


    public void addProcedure (Procedure procedure) {
        DaoFactory daoFactory = DaoFactory.getInstance();

        IAdministratorDao iAdministratorDao = daoFactory.createIAdministratorDao();

        iAdministratorDao.create(procedure);
    }
}
