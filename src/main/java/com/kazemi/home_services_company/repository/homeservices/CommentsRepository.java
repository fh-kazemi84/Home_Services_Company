package com.kazemi.home_services_company.repository.homeservices;

import com.kazemi.home_services_company.model.homeservices.Comments;
import com.kazemi.home_services_company.model.users.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fh.kazemi
 **/

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {
    List<Comments> findByExpert(Expert expert);
}
