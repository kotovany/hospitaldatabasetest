package com.example.kotovabd.interfaces;

import com.example.kotovabd.tables.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorsRepository  extends JpaRepository<Doctors, Long> {
}
