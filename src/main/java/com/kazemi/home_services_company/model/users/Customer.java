package com.kazemi.home_services_company.model.users;

import com.kazemi.home_services_company.enums.UserRole;
import com.kazemi.home_services_company.model.homeservices.Comments;
import com.kazemi.home_services_company.model.homeservices.Orders;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fh.kazemi
 **/

@Entity
@AllArgsConstructor
@Setter
@Getter
public class Customer extends Users {

    @OneToMany(mappedBy = "customer")
    private List<Comments> comments = new ArrayList<>();

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders = new ArrayList<>();

    public Customer() {
        this.setUserRole(UserRole.CUSTOMER);
    }
}
