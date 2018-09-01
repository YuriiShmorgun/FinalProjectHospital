package model.service;

import model.dao.DaoFactory;
import model.dao.IAdministratorDao;
import model.dao.ISystemDao;
import model.entity.User;

public class CreateUserServise {


public void addUser (User user) {
    DaoFactory daoFactory = DaoFactory.getInstance();

    try (IAdministratorDao iAdministratorDao = daoFactory.createIAdministratorDao();) {
        iAdministratorDao.create(user);
    } catch (Exception e) {
        e.printStackTrace();


    }




    }
}

