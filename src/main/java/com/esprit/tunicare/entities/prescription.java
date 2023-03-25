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
public class prescription implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Title;

    private LocalDate dateprescription;


    private LocalTime heureprescription;

    private  String content;



    @OneToOne
    private consultation consultation;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medecin_id")
    private medecin medecin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dossier_medicale_id")
    private Dossier_medicale dossier_medicale;

}
