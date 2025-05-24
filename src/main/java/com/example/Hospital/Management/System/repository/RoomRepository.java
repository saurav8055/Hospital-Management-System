package com.example.Hospital.Management.System.repository;

import com.example.Hospital.Management.System.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}