package com.example.Aelvynx_01.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@Data
@Table(name = "team_details")
@Entity

public class TeamDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UuidGenerator
    @Column(unique = true)
    private UUID usersId;

    private String fullName;
    private String fatherName;
    private String email;
    private String position;
    private String contact;
    private String bloodGroup;
    private String address;
    private String edBg;
    private String image;
    private String joinInDate;


    @CreationTimestamp
    private LocalDateTime CreateTime;
}
