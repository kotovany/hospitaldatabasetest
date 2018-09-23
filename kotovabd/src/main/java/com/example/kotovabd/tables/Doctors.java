package com.example.kotovabd.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "doctors")
public class Doctors implements Serializable {

    @Id
    @Column(name = "id_doctor")
    private Long id_doctor;
    private String doctor_name;

    @JsonIgnore
    @OneToMany(mappedBy = "doctors")
    private Collection<Doctors> doctors;

    public Doctors() {}

    public Doctors(Long id_doctor, String doctor_name, Collection<Doctors> doctors){
        this.id_doctor = id_doctor;
        this.doctor_name = doctor_name;
        this.doctors = doctors;
    }

    public Long getId_doctor() {
        return id_doctor;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public void setId_doctor(Long id_doctor) {
        this.id_doctor = id_doctor;
    }
}
