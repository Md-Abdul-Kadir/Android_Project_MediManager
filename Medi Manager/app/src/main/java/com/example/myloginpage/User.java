package com.example.myloginpage;

public class User {
    private String doctorName,doctorSpecialist;

    public User(String doctorName, String doctorSpecialist) {
        this.doctorName = doctorName;
        this.doctorSpecialist = doctorSpecialist;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpecialist() {
        return doctorSpecialist;
    }

    public void setDoctorSpecialist(String doctorSpecialist) {
        this.doctorSpecialist = doctorSpecialist;
    }
}
