package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.rendez_vous;

import java.util.List;

public interface rendez_vousService {

    List<rendez_vous> findAll();
    rendez_vous findById(Long id);
    rendez_vous save (rendez_vous rendez_vous );
    void delete(Long id);
}
