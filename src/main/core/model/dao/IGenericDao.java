package model.dao;

import java.util.List;

public interface IGenericDao<T>  extends AutoCloseable{
    void create (T entity);
    T findById(int id);
    List<T> findAll();
    void update(T entity);
    void delete(int id);
}
