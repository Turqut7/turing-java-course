package az.edu.turing.miniProjects.patientProject.dao;

import az.edu.turing.miniProjects.patientProject.model.dto.PatientDTO;

import java.util.List;
import java.util.ArrayList;

public interface PatientDAO {
    PatientDTO getPatientById(int id);

    List<PatientDTO> getAllPatients();

    void savePatient(PatientDTO patient);
}
