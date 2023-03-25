package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.patient_consultation_externe;

import java.util.List;

public interface patient_consultation_externeService {
    List<patient_consultation_externe> findAll();
    patient_consultation_externe findById(Long id);
    patient_consultation_externe save (patient_consultation_externe patient_consultation_externe );
    void delete(Long id);


}
