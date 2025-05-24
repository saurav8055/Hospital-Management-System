package com.example.Hospital.Management.System.repository;

import com.example.Hospital.Management.System.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}