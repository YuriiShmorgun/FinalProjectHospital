package model.service;

import model.dao.DaoFactory;
import model.dao.IPatientDao;
import model.entity.User;

import java.util.List;

public class PatientService {

    DaoFactory daoFactory = DaoFactory.getInstance();

    public List <User> getAllPatient(){
        try (IPatientDao dao = daoFactory.createIPatientDao()){
            return dao.findAll();
        } catch (Exception e) {
            return null;
        }
    }
}
