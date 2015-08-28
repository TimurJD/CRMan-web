package ua.com.vhsoft.crman.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import ua.com.vhsoft.crman.mvc.models.SubCommunicationType;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public interface SubCommunicationTypeRepository extends JpaRepository<Integer, SubCommunicationType>, QueryDslPredicateExecutor<SubCommunicationType> {
    
}
