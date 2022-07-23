package com.example.hospital.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@SuppressWarnings("ALL")

public class Doctor {
    private Long doctor_id;
    private String name;
    private Long age;
    private String consult;
    private String gender;
    private String speciality;

    public Doctor(Long doctor_id, String name, Long age, String consult, String gender, String speciality) {
        this.doctor_id = doctor_id;
        this.name = name;
        this.age = age;
        this.consult = consult;
        this.gender = gender;
        this.speciality = speciality;
    }
}
