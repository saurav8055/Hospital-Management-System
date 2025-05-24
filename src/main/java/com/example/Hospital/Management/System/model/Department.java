package com.example.Hospital.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String floor;

    @OneToMany(mappedBy = "department")
    private List<Doctor> doctors;

    @OneToMany(mappedBy = "department")
    private List<Staff> staffMembers;
}

