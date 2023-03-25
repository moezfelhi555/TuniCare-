package com.esprit.tunicare.entities;

import com.esprit.tunicare.entities.enumeration.bloodType;
import com.esprit.tunicare.entities.enumeration.genderType;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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

@Inheritance(strategy = InheritanceType.JOINED)
public class patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private  String CIN ;
    private  String img_url;
    //@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
    private String adress;
    private String phone_nbr;
    private String email_addr;
    @Enumerated
    private genderType gender;
    @Enumerated
    private bloodType blood_type;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dossier_medicale> dossiersMedicaux;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<consultation> consultations;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<prescription> prescription;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<rendez_vous> rendez_vous;




}
