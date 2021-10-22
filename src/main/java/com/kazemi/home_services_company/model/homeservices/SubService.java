package com.kazemi.home_services_company.model.homeservices;

import com.kazemi.home_services_company.model.users.Expert;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
@Table(name = "sub_service")
public class SubService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "base_price")
    private Double basePrice;

    @Column(name = "description")
    private String description;

    @ManyToOne
    private Service service;

    @ManyToMany(mappedBy = "subServices", fetch = FetchType.LAZY)
    private List<Expert> experts = new ArrayList<>();

    @OneToMany(mappedBy = "subService", fetch = FetchType.LAZY)
    private List<Orders> orders = new ArrayList<>();
}
