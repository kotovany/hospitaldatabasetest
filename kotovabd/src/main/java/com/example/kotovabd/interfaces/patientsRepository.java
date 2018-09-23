package com.example.kotovabd.interfaces;

import com.example.kotovabd.tables.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientsRepository extends JpaRepository<Patients, Long> {
}
