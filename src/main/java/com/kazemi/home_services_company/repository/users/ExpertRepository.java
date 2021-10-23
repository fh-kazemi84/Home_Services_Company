package com.kazemi.home_services_company.repository.users;

import com.kazemi.home_services_company.model.users.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fh.kazemi
 **/

@Repository
public interface ExpertRepository extends JpaRepository<Expert, Integer> {
    Expert findByEmail(String email);
}
