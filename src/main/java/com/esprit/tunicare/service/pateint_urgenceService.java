package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.*;

import java.util.List;

public interface pateint_urgenceService {
    List<patient_urgence> findAll();
    patient_urgence findById(Long id);
    patient_urgence save (patient_urgence patient_urgence );
    void delete(Long id);

}
