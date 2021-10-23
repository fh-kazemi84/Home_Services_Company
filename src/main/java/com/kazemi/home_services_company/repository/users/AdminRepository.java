package com.kazemi.home_services_company.repository.users;

import com.kazemi.home_services_company.model.users.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author fh.kazemi
 **/

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    @Override
    Optional<Admin> findById(Integer id);

    Optional<Admin> findByUsername(String username);
}
