package com.example.testshift.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PhoneRepo extends JpaRepository<Phone, Long> {
}
