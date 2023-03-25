package com.esprit.tunicare.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class rendez_vous implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title;
    private String remarque;


    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medecin_id")
    private medecin medecin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dossier_medicale_id")
    private Dossier_medicale dossier_medicale;

    @OneToOne
    private consultation consultation;


}
