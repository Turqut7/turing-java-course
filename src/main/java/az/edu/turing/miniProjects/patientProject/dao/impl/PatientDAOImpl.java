package az.edu.turing.miniProjects.patientProject.dao.impl;

import az.edu.turing.miniProjects.patientProject.dao.PatientDAO;
import az.edu.turing.miniProjects.patientProject.model.dto.PatientDTO;

import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {

    private List<PatientDTO> patients = new ArrayList();

    @Override
    public PatientDTO getPatientById(int id) {
        for (PatientDTO patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    @Override
    public List<PatientDTO> getAllPatients() {
        return patients;
    }

    @Override
    public void savePatient(PatientDTO patient) {
        patients.add(patient);
    }
}
