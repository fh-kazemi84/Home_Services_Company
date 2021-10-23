package com.kazemi.home_services_company.repository.homeservices;

import com.kazemi.home_services_company.model.homeservices.Service;
import com.kazemi.home_services_company.model.homeservices.SubService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author fh.kazemi
 **/

@Repository
public interface SubServiceRepository extends JpaRepository<SubService, Integer> {
    Optional<SubService> findByName(String name);

    @Query("SELECT s from SubService s WHERE s.service.name=:name")
    List<SubService> findByServiceName(@Param("name") Service service);
}
