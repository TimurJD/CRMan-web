package ua.com.vhsoft.crman.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import ua.com.vhsoft.crman.mvc.models.SubRegion;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public interface SubRegionRepository extends JpaRepository<SubRegion, Integer>, QueryDslPredicateExecutor<SubRegion> {
    
}
