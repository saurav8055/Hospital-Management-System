package com.example.Hospital.Management.System.dto;

import lombok.Data;

@Data
public class MedicalRecordDTO {
    private Long id;
    private Long patientId;
    private String diagnosis;
    private String treatment;
    private String notes;
}
