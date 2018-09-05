package model.service;

import model.dao.DaoFactory;
import model.dao.IDoctorDao;
import model.entity.DiagnosesInfo;
import model.entity.User;

import java.util.List;

public class FindAllByIdService {

    List<DiagnosesInfo> diagnosesInfoList = null;

    public List<DiagnosesInfo> findPatientDiagnoses (int patientId) {

        DaoFactory daoFactory = DaoFactory.getInstance();
        try (IDoctorDao iDoctorDao = daoFactory.createIDoctorDao();) {
            diagnosesInfoList = iDoctorDao.findAllById(patientId);
        } catch (Exception e) {
            e.printStackTrace();

        }

        return diagnosesInfoList;
    }



}
