package com.example.javanasanweek4.repository;

import com.example.javanasanweek4.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    List<Application> findByApplicantId(int applicantId);
}
