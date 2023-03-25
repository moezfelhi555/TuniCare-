package com.esprit.tunicare.service;

import com.esprit.tunicare.entities.Dossier_medicale;

import java.util.List;

public interface Dossier_medicaleService {
      List<Dossier_medicale> findAll();
      Dossier_medicale findById(Long id);
      Dossier_medicale save (Dossier_medicale dossier_medicale );
      void delete(Long id);

}
