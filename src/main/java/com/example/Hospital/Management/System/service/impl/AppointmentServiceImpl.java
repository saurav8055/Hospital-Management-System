package com.example.Hospital.Management.System.service.impl;

import com.example.Hospital.Management.System.model.Appointment;
import com.example.Hospital.Management.System.repository.AppointmentRepository;
import com.example.Hospital.Management.System.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    @Autowired
    public void AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found with id " + id));
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment updated) {
        Appointment appointment = getAppointmentById(id);
        appointment.setAppointmentDate(updated.getAppointmentDate());
        appointment.setStatus(updated.getStatus());
        appointment.setDoctor(updated.getDoctor());
        appointment.setPatient(updated.getPatient());
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}

