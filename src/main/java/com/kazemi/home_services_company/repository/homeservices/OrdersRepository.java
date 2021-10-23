package com.kazemi.home_services_company.repository.homeservices;

import com.kazemi.home_services_company.model.homeservices.Orders;
import com.kazemi.home_services_company.model.users.Customer;
import com.kazemi.home_services_company.model.users.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fh.kazemi
 **/

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findByExpert(Expert expert);

    List<Orders> findByCustomer(Customer customer);

    @Query("SELECT o FROM Orders as o WHERE o.subService in " +
            "(SELECT s From SubService s WHERE :expert member s.experts)")
    List<Orders> findOrdersByExpertSubServices(@Param("expert") Expert expert);
}
