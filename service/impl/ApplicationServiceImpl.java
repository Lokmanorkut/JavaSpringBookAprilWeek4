package com.example.javanasanweek4.service.impl;

import com.example.javanasanweek4.dto.application.CreateApplicationRequest;
import com.example.javanasanweek4.dto.application.GetApplicationResponse;
import com.example.javanasanweek4.entity.Application;
import com.example.javanasanweek4.mapper.ApplicationMapper;
import com.example.javanasanweek4.repository.ApplicationRepository;
import com.example.javanasanweek4.service.ApplicationService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository repository;
    private final ApplicationMapper mapper;

    public ApplicationServiceImpl(ApplicationRepository repository, ApplicationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void add(CreateApplicationRequest request) {
        Application application = mapper.createApplicationRequestToApplication(request);
        repository.save(application);
    }

    @Override
    public List<GetApplicationResponse> getAll() {
        return repository.findAll().stream()
                .map(mapper::applicationToGetApplicationResponse)
                .collect(Collectors.toList());
    }
}
