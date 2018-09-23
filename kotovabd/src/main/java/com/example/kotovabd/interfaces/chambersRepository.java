package com.example.kotovabd.interfaces;

import com.example.kotovabd.tables.Chambers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface chambersRepository extends JpaRepository<Chambers, Long> {
}
