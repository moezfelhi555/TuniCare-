package com.esprit.tunicare.entities;

import com.esprit.tunicare.entities.enumeration.service_hosp;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Dossier_medicale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motif_admission;
    @Enumerated
    private service_hosp Service_hospitalier;

    private String antecedents;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreation;

    private String attachment_file;


    @ManyToOne
    @JoinColumn(name = "patient_id")
    private com.esprit.tunicare.entities.patient patient;

    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private medecin medecin;

    @OneToMany(mappedBy = "dossier_medicale", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<consultation> consultations;

    @OneToMany(mappedBy = "dossier_medicale", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<prescription> prescription;

    @OneToMany(mappedBy = "dossier_medicale", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<rendez_vous> rendez_vous;

}
