package com.kazemi.home_services_company.model.homeservices;

import com.kazemi.home_services_company.enums.OrderSituation;
import com.kazemi.home_services_company.model.users.Customer;
import com.kazemi.home_services_company.model.users.Expert;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fh.kazemi
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "proposed_price")
    private Double proposedPrice;

    @Column(name = "job_description")
    private String jobDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "order_registration_date", updatable = false)
    private Date orderRegistrationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "job_date", updatable = false)
    private Date jobDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "order_situation")
    private OrderSituation situation;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private SubService subService;

    @OneToMany(mappedBy = "orders")
    private List<ExpertOffers> offers = new ArrayList<>();

    @ManyToOne
    private Expert expert;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
}
