package com.kazemi.home_services_company.model.homeservices;

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
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "country")
    private String country;

    @Column(name = "province")
    private String province;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "address")
    private String address;

    @Column(name = "postal_Code")
    private Long postalCode;
}
