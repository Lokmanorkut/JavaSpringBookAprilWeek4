package com.example.javanasanweek4.service;

import com.example.javanasanweek4.dto.application.CreateApplicationRequest;
import com.example.javanasanweek4.dto.application.GetApplicationResponse;
import java.util.List;

public interface ApplicationService {
    void add(CreateApplicationRequest request);
    List<GetApplicationResponse> getAll();
}
