package model.service;

import model.dao.DaoFactory;
import model.dao.IAdministratorDao;
import model.dao.ISystemDao;
import model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class LoadAllUsersService {

    public List<User> getAllUsers () {
        DaoFactory daoFactory = DaoFactory.getInstance();
        try (IAdministratorDao iAdministratorDao = daoFactory.createIAdministratorDao();) {
            List<User> userList = iAdministratorDao.findAll();
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

}
