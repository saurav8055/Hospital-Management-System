package com.example.Hospital.Management.System.repository;

import com.example.Hospital.Management.System.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}
