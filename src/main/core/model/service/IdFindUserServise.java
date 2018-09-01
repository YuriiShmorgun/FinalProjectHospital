package model.service;

import model.dao.DaoFactory;
import model.dao.IDoctorDao;
import model.entity.User;

public class IdFindUserServise {

    public User getById (int id){

        int t = id;
        System.out.println(id);

        DaoFactory daoFactory = DaoFactory.getInstance();

        try (IDoctorDao iDoctorDao = daoFactory.createIDoctorDao();) {
            User user = (User) iDoctorDao.findById(id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
