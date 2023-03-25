package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.patient_hospitalise;

import java.util.List;

public interface patient_hospitaliseService {
    List<patient_hospitalise> findAll();
    patient_hospitalise findById(Long id);
    patient_hospitalise save (patient_hospitalise patient_urgence );
    void delete(Long id);

}
