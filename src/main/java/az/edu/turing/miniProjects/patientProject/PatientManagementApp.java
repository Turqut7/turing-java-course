package az.edu.turing.miniProjects.patientProject;

import az.edu.turing.miniProjects.patientProject.controller.PatientController;
import az.edu.turing.miniProjects.patientProject.dao.PatientDAO;
import az.edu.turing.miniProjects.patientProject.dao.impl.PatientDAOImpl;
import az.edu.turing.miniProjects.patientProject.model.dto.PatientDTO;
import az.edu.turing.miniProjects.patientProject.service.PatientService;
import az.edu.turing.miniProjects.patientProject.service.impl.PatientServiceImpl;

public class PatientManagementApp {
    public static void main(String[] args) {

        PatientDAO patientDAO = new PatientDAOImpl();
        PatientService patientService = new PatientServiceImpl(patientDAO);

        PatientController patientController = new PatientController(patientService);

        PatientDTO patient1 = new PatientDTO(1, "Saleh", 24, "Depression ");
        PatientDTO patient2 = new PatientDTO(2, "Leyla", 20, "Asthma ");

        patientController.addNewPatient(patient1);
        patientController.addNewPatient(patient2);

        patientController.getPatientInfo(3);
        patientController.getPatientInfo(2);
        patientController.getPatientInfo(1);
    }
}
