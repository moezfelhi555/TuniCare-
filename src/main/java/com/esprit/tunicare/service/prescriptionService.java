package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.prescription;

import java.util.List;

public interface prescriptionService {
    List<prescription> findAll();
    prescription findById(Long id);
    prescription save (prescription patient_urgence );
    void delete(Long id);
}
