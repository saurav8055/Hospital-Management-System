package com.example.Hospital.Management.System.service;

import com.example.Hospital.Management.System.model.MedicalRecord;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecord> getAllRecords();
    MedicalRecord getRecordById(Long id);
    MedicalRecord createRecord(MedicalRecord record);
    MedicalRecord updateRecord(Long id, MedicalRecord record);
    void deleteRecord(Long id);
}
