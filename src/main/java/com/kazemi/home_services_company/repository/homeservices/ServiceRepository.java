package com.kazemi.home_services_company.repository.homeservices;

import com.kazemi.home_services_company.model.homeservices.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fh.kazemi
 **/

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    Service findByName(String name);
}
