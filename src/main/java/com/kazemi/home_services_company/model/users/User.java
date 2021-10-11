package com.kazemi.home_services_company.model.users;

import com.kazemi.home_services_company.enums.UserRole;
import com.kazemi.home_services_company.enums.UserSituation;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
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
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private UserRole userRole;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_situation")
    private UserSituation userSituation;

    @CreationTimestamp
    @Column(name = "registration_date", updatable = false)
    private Date registrationDate = new Date();

    @Column(name = "credit")
    private Long credit;

    public String getFullName() {
        return this.name + " " + getFamily();
    }
}
