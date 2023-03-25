package com.esprit.tunicare.repositories;

import com.esprit.tunicare.entities.prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface prescriptionRepository extends JpaRepository<Long, prescription> {
}
