package com.example.javanasanweek4.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Blacklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reason;
    private LocalDate date;
    private int applicantId;
}
