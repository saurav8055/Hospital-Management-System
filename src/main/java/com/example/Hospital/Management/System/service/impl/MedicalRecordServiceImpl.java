package com.example.Hospital.Management.System.service.impl;

import com.example.Hospital.Management.System.model.MedicalRecord;
import com.example.Hospital.Management.System.repository.MedicalRecordRepository;
import com.example.Hospital.Management.System.service.MedicalRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    private void MedicalRecordServiceImpl(MedicalRecordRepository medicalRecordRepository){
        this.medicalRecordRepository = medicalRecordRepository;
    }

    @Override
    public List<MedicalRecord> getAllRecords() {
        return medicalRecordRepository.findAll();
    }

    @Override
    public MedicalRecord getRecordById(Long id) {
        return medicalRecordRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medical record not found with id " + id));
    }

    @Override
    public MedicalRecord createRecord(MedicalRecord record) {
        return medicalRecordRepository.save(record);
    }

    @Override
    public MedicalRecord updateRecord(Long id, MedicalRecord updated) {
        MedicalRecord record = getRecordById(id);
        record.setDateOfRecord(updated.getDateOfRecord());
        record.setDiagnosis(updated.getDiagnosis());
        record.setTreatment(updated.getTreatment());
        record.setNotes(updated.getNotes());
        record.setDoctor(updated.getDoctor());
        return medicalRecordRepository.save(record);
    }

    @Override
    public void deleteRecord(Long id) {
        medicalRecordRepository.deleteById(id);
    }
}

