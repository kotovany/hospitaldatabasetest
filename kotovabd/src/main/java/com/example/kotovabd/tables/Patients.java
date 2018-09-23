package com.example.kotovabd.tables;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Patients")
public class Patients implements Serializable {

    @Id
    @Column(name = "id_patient")
    private Long id_patient;
    private String name_patient;
    private String address_patient;
    private Date date_patient;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chambers_id")
    private Chambers chambers;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_doctor")
    private Doctors doctors;

    public Patients(){}

    public Long getId_patient() {
        return id_patient;
    }

    public void setId_patient(Long id_patient) {
        this.id_patient = id_patient;
    }

    public String getName_patient() {
        return name_patient;
    }

    public void setName_patient(String name_patient) {
        this.name_patient = name_patient;
    }

    public String getAddress_patient() {
        return address_patient;
    }

    public void setAddress_patient(String address_patient) {
        this.address_patient = address_patient;
    }

    public Date getDate_patient() {
        return date_patient;
    }

    public void setDate_patient(Date date_patient) {
        this.date_patient = date_patient;
    }

    public Chambers getChambers() {
        return chambers;
    }

    public void setChambers(Chambers chambers) {
        this.chambers = chambers;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }
}
