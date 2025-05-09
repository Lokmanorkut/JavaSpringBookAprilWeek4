package com.example.javanasanweek4.entity;

import com.example.javanasanweek4.entity.enums.BootcampState;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int instructorId;
    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private BootcampState bootcampState;
}
