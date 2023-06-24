package impl;

import db.DataBase;
import model.Patient;
import service.PatientService;

import java.util.Collections;
import java.util.List;

public class PatientServiceImpl implements PatientService {
    private DataBase dataBase;

    public PatientServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Patient> addHospital(List<Patient> patients) {
        for (Patient n:patients) {
            if(dataBase.getPatients()equals(patients))
                patients.addAll(patients);
        }

        return patients;
    }

    @Override
    public Patient getPatientFirstName(String name) {
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public void groupingByGender() {

    }

    @Override
    public List<Patient> filterByAge() {
        return null;
    }
}
