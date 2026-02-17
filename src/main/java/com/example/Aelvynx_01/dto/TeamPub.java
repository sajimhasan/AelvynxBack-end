package com.example.Aelvynx_01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class TeamPub {

    private UUID usersId;
    private String fullName;
    private String position;
}
