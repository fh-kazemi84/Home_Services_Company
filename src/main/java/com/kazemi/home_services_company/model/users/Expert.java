package com.kazemi.home_services_company.model.users;

import com.kazemi.home_services_company.model.homeservices.Comments;
import com.kazemi.home_services_company.model.homeservices.ExpertOffers;
import com.kazemi.home_services_company.model.homeservices.Order;
import com.kazemi.home_services_company.model.homeservices.SubService;
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
public class Expert extends User {

    @Lob
    @Column(name = "expert_image")
    private byte[] image;

    @Column(name = "expert_score")
    private Integer score;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "expert_services",
            joinColumns = {
                    @JoinColumn(name = "expert_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "subService_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private List<SubService> subServices = new ArrayList<>();

    @OneToMany(mappedBy = "expert")
    private List<ExpertOffers> offers = new ArrayList<>();

    @OneToMany(mappedBy = "expert")
    private List<Comments> comments = new ArrayList<>();

    @OneToMany(mappedBy = "expert")
    private List<Order> orders = new ArrayList<>();

    @Column(name = "field")
    private String field;
}
