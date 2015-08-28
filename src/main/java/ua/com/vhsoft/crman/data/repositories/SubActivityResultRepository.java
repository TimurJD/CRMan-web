package ua.com.vhsoft.crman.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import ua.com.vhsoft.crman.mvc.models.SubActivityResult;

/**
 *
 * @author VH
 */
public interface SubActivityResultRepository extends JpaRepository<Integer, SubActivityResult>, QueryDslPredicateExecutor<SubActivityResult> {

}
