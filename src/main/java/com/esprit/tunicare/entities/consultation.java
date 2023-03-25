package com.esprit.tunicare.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateConsultation;

    private LocalTime heureConsultation;


    private String symptomes;

    private String diagnostic;

    private String traitement;

    private String commentaire ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medecin_id")
    private medecin medecin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dossier_medical_id")
    private Dossier_medicale dossier_medicale;

    @OneToOne
    private prescription prescription;

    @OneToOne
    private rendez_vous rendez_vous  ;


}
