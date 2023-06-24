package impl;

import db.DataBase;
import service.DoctorService;

import java.util.List;

public class DoctorServiceImpl <Tt>implements DoctorService {
    private DataBase dataBase;

    public DoctorServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List addDoctot(Object o) {
        return null;
    }

    @Override
    public Object getDoctorById(Long id) {
        return null;
    }

    @Override
    public List filterByGender(String gender) {
        return null;
    }

    @Override
    public List getAllDoctors() {
        return null;
    }
}