package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.consultation;

import java.util.List;

public interface consultationService {
    public List<consultation> findAll();
    public  consultation findById(Long id);
    public  consultation save (consultation consultation );
    public void delete(Long id);




}
