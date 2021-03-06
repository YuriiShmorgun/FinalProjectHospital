package model.service;

import com.sun.xml.internal.bind.v2.model.core.ID;
import model.dao.DaoFactory;
import model.dao.IDoctorDao;
import model.entity.User;

import java.util.List;

public class LoadAllPatientService {

    public List<User> getAllUsers (){


        DaoFactory daoFactory = DaoFactory.getInstance();

        try (IDoctorDao iDoctorDao = daoFactory.createIDoctorDao();) {
            List<User> userList = iDoctorDao.findAll();
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
