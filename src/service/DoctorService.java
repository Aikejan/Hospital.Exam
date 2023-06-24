package service;

import java.util.List;

public interface DoctorService<T> {
    List<T> addDoctot(T t);
    T getDoctorById(Long id);
    List<T> filterByGender(String gender);
    List<T> getAllDoctors();
}
