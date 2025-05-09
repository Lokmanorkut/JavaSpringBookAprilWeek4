package com.example.javanasanweek4.repository;

import com.example.javanasanweek4.entity.Bootcamp;
import com.example.javanasanweek4.entity.enums.BootcampState;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BootcampRepository extends JpaRepository<Bootcamp, Integer> {
    List<Bootcamp> findByBootcampState(BootcampState state);
}
