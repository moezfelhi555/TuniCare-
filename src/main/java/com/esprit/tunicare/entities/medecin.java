package com.esprit.tunicare.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    private String specialite;

    @OneToMany(mappedBy = "medecin")
    private List<Dossier_medicale> dossiersMedicaux;


    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<consultation> consultations;
    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<prescription> prescription;
    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<rendez_vous> rendez_vous;



}
