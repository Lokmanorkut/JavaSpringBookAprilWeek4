package com.example.javanasanweek4.controller;

import com.example.javanasanweek4.dto.application.CreateApplicationRequest;
import com.example.javanasanweek4.dto.application.GetApplicationResponse;
import com.example.javanasanweek4.service.ApplicationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public void add(@RequestBody CreateApplicationRequest request) {
        applicationService.add(request);
    }

    @GetMapping
    public List<GetApplicationResponse> getAll() {
        return applicationService.getAll();
    }
}
