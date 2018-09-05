package model.dao;

import model.entity.User;

import java.util.List;


public interface IDoctorDao<T> extends IGenericDao {

    List<T> findAllById(int id);


}


