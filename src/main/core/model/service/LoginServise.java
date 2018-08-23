package model.service;

import model.dao.DaoFactory;
import model.dao.IPatientDao;
import model.dao.ISystemDao;
import model.entity.Role;
import model.entity.User;

import java.util.List;

import static model.dao.DaoFactory.daoFactory;
import static model.entity.Role.ADMINISTRATOR;

public class LoginServise {

    public User getUser (String login, String password){

        DaoFactory daoFactory = DaoFactory.getInstance();

        ISystemDao iSystemDao = daoFactory.createISystemDao();

        User user = iSystemDao.findByLoginPassword(login,password);


        return user;


    }
}
