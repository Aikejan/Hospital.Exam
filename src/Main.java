import enums.Gender;
import impl.HospitalServiceImpl;
import model.Doctor;
import model.Hospital;
import model.Patient;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Hospital hospital = new Hospital(1L,"Asan","Grajdanskaya 119", );

        Doctor doctor = new Doctor(2L,"Asan","Aliev","asan44@gmail.com"
                , Gender.MALE);
        Doctor doctor1 = new Doctor(5L,"Alina","Sarieva","alina77@gmail.com",
                ,Gender.FEMALE);

        Patient patient = new Patient(6L,"Samara","Turatova",555 56 78 90,
                Gender.FEMALE);
        Patient patient1 = new Patient(7L,"Samat","Sergeeva",550 66 90 90,
        Gender.MALE);
        Patient patient2 = new Patient(2L,"Vera","Sergeeva",554 00 08 90,
                Gender.FEMALE);






    }
}