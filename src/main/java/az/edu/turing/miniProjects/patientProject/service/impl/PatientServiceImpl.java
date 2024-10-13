package az.edu.turing.miniProjects.patientProject.service.impl;

import az.edu.turing.miniProjects.patientProject.dao.PatientDAO;
import az.edu.turing.miniProjects.patientProject.model.dto.PatientDTO;
import az.edu.turing.miniProjects.patientProject.service.PatientService;

public class PatientServiceImpl implements PatientService {

    private PatientDAO patientDAO;

    public PatientServiceImpl(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    @Override
    public PatientDTO getPatientById(int id) {
        return patientDAO.getPatientById(id);
    }

    @Override
    public void registerPatient(PatientDTO patient) {
        patientDAO.savePatient(patient);
    }

}
