package com.example.Hospital.Management.System.controller;

import com.example.Hospital.Management.System.model.MedicalRecord;
import com.example.Hospital.Management.System.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medical-records")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @GetMapping
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordService.getAllRecords();
    }

    @PostMapping
    public MedicalRecord createMedicalRecord(@RequestBody MedicalRecord record) {
        return medicalRecordService.createRecord(record);
    }

    @PutMapping("/{id}")
    public MedicalRecord updateMedicalRecord(@PathVariable Long id, @RequestBody MedicalRecord record) {
        return medicalRecordService.updateRecord(id, record);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicalRecord(@PathVariable Long id) {
        medicalRecordService.deleteRecord(id);
    }
}

