package com.kazemi.home_services_company.model.homeservices;

import com.kazemi.home_services_company.enums.ExpertOffersSituation;
import com.kazemi.home_services_company.model.users.Expert;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author fh.kazemi
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "expert_offers")
public class ExpertOffers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "offer_price")
    private Double offerPrice;

    @Temporal(value = TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "submitted_date")
    private Date submittedDate;

    @Temporal(value = TemporalType.TIME)
    @CreationTimestamp
    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "job_duration")
    private Long jobDuration;

    @Enumerated(EnumType.STRING)
    @Column(name = "offers_situation")
    private ExpertOffersSituation offersSituation;

    @ManyToOne
    private Expert expert;

    @ManyToOne
    private Orders orders;
}
