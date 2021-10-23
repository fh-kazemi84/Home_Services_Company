package com.kazemi.home_services_company.repository.users;

import com.kazemi.home_services_company.model.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author fh.kazemi
 **/

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {

    Optional<Users> findByEmail(String email);

    @Query("SELECT u FROM Users u WHERE u.verificationCode = ?1")
    Users findByVerificationCode(String code);
}
