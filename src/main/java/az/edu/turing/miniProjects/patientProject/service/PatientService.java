package az.edu.turing.miniProjects.patientProject.service;

import az.edu.turing.miniProjects.patientProject.model.dto.PatientDTO;

public interface PatientService {
    PatientDTO getPatientById(int id);

    void registerPatient(PatientDTO patient);
}
