package service;

import model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> addHospital(List<Patient> patients);
    Patient getPatientFirstName(String name);
    List<Patient> getAllPatients();
    void  groupingByGender();
    List<Patient> filterByAge();

}
