package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.patient;

import java.util.List;

public interface pateintService {
    List<patient> findAll();
    patient findById(Long id);
    patient save (patient patient );
    void delete(Long id);

}
