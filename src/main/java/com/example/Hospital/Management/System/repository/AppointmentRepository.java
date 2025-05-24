package com.example.Hospital.Management.System.repository;

import com.example.Hospital.Management.System.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
