package com.kazemi.home_services_company.model.homeservices;

import com.kazemi.home_services_company.model.users.Customer;
import com.kazemi.home_services_company.model.users.Expert;
import lombok.*;

import javax.persistence.*;

/**
 * @author fh.kazemi
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "rate")
    private Double rate;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Expert expert;

    @OneToOne
    private Orders order;
}
