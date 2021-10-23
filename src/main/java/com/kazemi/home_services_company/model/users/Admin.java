package com.kazemi.home_services_company.model.users;

import com.kazemi.home_services_company.enums.UserRole;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author fh.kazemi
 **/

@Entity
@Setter
@Getter
@ToString
public class Admin extends Users {
    @Column(name = "username")
    private String username;

    public Admin() {
        this.setUserRole(UserRole.ADMIN);
    }
}
