package com.example.Hospital.Management.System.repository;

import com.example.Hospital.Management.System.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
