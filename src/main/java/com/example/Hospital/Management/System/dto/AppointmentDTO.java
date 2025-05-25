package com.example.Hospital.Management.System.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentDTO {
    private Long id;
    private Long doctorId;
    private Long patientId;
    private LocalDateTime appointmentDate;
    private String reason;
}
