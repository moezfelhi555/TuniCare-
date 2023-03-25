package com.esprit.tunicare.repositories;

import com.esprit.tunicare.entities.medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface medecinRepository extends JpaRepository<Long, medecin> {
}
