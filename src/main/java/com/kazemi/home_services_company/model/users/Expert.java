package com.kazemi.home_services_company.model.users;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

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
}
