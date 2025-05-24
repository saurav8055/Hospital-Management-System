package com.example.Hospital.Management.System.service.impl;

import com.example.Hospital.Management.System.model.Staff;
import com.example.Hospital.Management.System.repository.StaffRepository;
import com.example.Hospital.Management.System.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    private void StaffServiceImpl(StaffRepository staffRepository){
        this.staffRepository = staffRepository;
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @Override
    public Staff getStaffById(Long id) {
        return staffRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Staff not found with id " + id));
    }

    @Override
    public Staff createStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff updateStaff(Long id, Staff updated) {
        Staff staff = getStaffById(id);
        staff.setName(updated.getName());
        staff.setRole(updated.getRole());
        staff.setContactNumber(updated.getContactNumber());
        staff.setEmail(updated.getEmail());
        staff.setDepartment(updated.getDepartment());
        return staffRepository.save(staff);
    }

    @Override
    public void deleteStaff(Long id) {
        staffRepository.deleteById(id);
    }
}

