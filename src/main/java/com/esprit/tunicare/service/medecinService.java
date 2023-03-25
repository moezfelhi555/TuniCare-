package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.medecin;

import java.util.List;

public interface medecinService {
    List<medecin> findAll();
    medecin findById(Long id);
    medecin save (medecin medecin );
    void delete(Long id);



}
