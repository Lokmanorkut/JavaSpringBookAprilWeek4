package com.example.javanasanweek4.dto.application;

import com.example.javanasanweek4.entity.enums.ApplicationState;

public class GetApplicationResponse {
    public int id;
    public int applicantId;
    public int bootcampId;
    public ApplicationState applicationState;
}
