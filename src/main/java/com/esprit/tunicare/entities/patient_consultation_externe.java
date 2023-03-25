package com.esprit.tunicare.entities;

import com.esprit.tunicare.entities.enumeration.service_hosp;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class patient_consultation_externe extends patient implements Serializable {
    @Temporal(TemporalType.DATE)
    private Date date_arrive ;
    @Enumerated
    private service_hosp service_hospitalise ;

}
