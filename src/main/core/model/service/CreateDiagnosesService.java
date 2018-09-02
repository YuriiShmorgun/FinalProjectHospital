package model.service;

import model.dao.DaoFactory;
import model.dao.IDoctorDao;
import model.entity.Diagnoses;

public class CreateDiagnosesService {

    public void addDiagnoses (Diagnoses diagnoses) {

        DaoFactory daoFactory = DaoFactory.getInstance();
        try (IDoctorDao iDoctorDao = daoFactory.createIDoctorDao();) {
            iDoctorDao.create(diagnoses);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
