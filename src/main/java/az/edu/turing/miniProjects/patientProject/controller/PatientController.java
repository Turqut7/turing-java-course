package az.edu.turing.miniProjects.patientProject.controller;

import az.edu.turing.miniProjects.patientProject.model.dto.PatientDTO;
import az.edu.turing.miniProjects.patientProject.service.PatientService;

public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    public void addNewPatient(PatientDTO patient) {
        patientService.registerPatient(patient);
        System.out.println("Patient registered successfully!");
    }

    public void getPatientInfo(int id) {
        PatientDTO patient = patientService.getPatientById(id);
        if (patient != null) {
            System.out.println("Patient details : " + patient.toString());
        } else {
            System.out.println("No patient found with given ID.");
        }

    }

}
