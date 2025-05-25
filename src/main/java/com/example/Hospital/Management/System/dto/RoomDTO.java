package com.example.Hospital.Management.System.dto;

import lombok.Data;

@Data
public class RoomDTO {
    private Long id;
    private String roomNumber;
    private String type;
    private Boolean available;
}

