package impl;

import db.DataBase;
import model.Hospital;
import service.HospitalService;

import java.util.List;

public class HospitalServiceImpl<H, L extends Number> implements HospitalService {
    private DataBase dataBase;

    public HospitalServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Hospital> addHospital(Hospital hospital) {
        return null;
    }

    @Override
    public List<Hospital> addHospitals(List<Hospital> hospitals) {
        return null;
    }

    @Override
    public Hospital getHospitalById(Long id) {
        return null;
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return null;
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {

    }

    @Override
    public List<Hospital> sortHospitalByName(String sort) {
        return null;
    }
}
