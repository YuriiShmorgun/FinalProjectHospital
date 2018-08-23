package model.dao;

import model.entity.User;

public interface ISystemDao extends IGenericDao<User>  {

    User findByLoginPassword(String login, String password);

}
