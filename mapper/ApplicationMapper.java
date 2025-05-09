package com.example.javanasanweek4.mapper;

import com.example.javanasanweek4.dto.application.CreateApplicationRequest;
import com.example.javanasanweek4.dto.application.GetApplicationResponse;
import com.example.javanasanweek4.entity.Application;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
    @Mapping(target = "applicantId", source = "applicantId")
    Application createApplicationRequestToApplication(CreateApplicationRequest request);

    @Mapping(target = "id", source = "id")
    GetApplicationResponse applicationToGetApplicationResponse(Application application);
}
