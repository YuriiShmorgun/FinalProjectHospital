package model.service;

import model.dao.DaoFactory;
import model.dao.IAdministratorDao;
import model.dao.ISystemDao;
import model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class LoadAllUsers {

    public List<User> getAllUsers (){
        DaoFactory daoFactory = DaoFactory.getInstance();
        IAdministratorDao iAdministratorDao = daoFactory.createIAdministratorDao();
        List<User> userList = iAdministratorDao.findAll();
        return userList;


    }

}
