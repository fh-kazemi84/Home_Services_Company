package com.kazemi.home_services_company.repository.homeservices;

import com.kazemi.home_services_company.model.homeservices.ExpertOffers;
import com.kazemi.home_services_company.model.homeservices.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author fh.kazemi
 **/

@Repository
public interface ExpertOffersRepository extends JpaRepository<ExpertOffers, Integer> {
    Optional<ExpertOffers> findByOrders(Orders orders);
}
