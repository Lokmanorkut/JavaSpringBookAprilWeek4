package com.example.javanasanweek4.entity;

import com.example.javanasanweek4.entity.enums.ApplicationState;
import jakarta.persistence.*;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int applicantId;
    private int bootcampId;

    @Enumerated(EnumType.STRING)
    private ApplicationState applicationState;
}
