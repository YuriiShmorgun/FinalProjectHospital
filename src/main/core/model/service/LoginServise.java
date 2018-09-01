package model.service;

import model.dao.DaoFactory;
import model.dao.IAdministratorDao;
import model.dao.ISystemDao;
import model.entity.User;

import java.util.List;

public class LoginServise {

    public User getUser (String login, String password){

        DaoFactory daoFactory = DaoFactory.getInstance();
        try (ISystemDao iSystemDao = daoFactory.createISystemDao();) {
            User user = iSystemDao.findByLoginPassword(login,password);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
