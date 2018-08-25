package model.service;

import model.dao.DaoFactory;
import model.dao.ISystemDao;
import model.entity.User;

public class LoginServise {

    public User getUser (String login, String password){

        DaoFactory daoFactory = DaoFactory.getInstance();

        ISystemDao iSystemDao = daoFactory.createISystemDao();

        User user = iSystemDao.findByLoginPassword(login,password);

        return user;


    }
}
