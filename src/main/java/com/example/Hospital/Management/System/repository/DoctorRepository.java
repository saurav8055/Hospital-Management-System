package com.example.Hospital.Management.System.repository;

import com.example.Hospital.Management.System.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}

