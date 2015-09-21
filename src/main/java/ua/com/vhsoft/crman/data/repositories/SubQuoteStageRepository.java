/**
 * 
 */
package ua.com.vhsoft.crman.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import ua.com.vhsoft.crman.mvc.models.SubQuoteStage;

/**
 * @author Timur Berezhnoi
 *
 */
public interface SubQuoteStageRepository extends JpaRepository<SubQuoteStage, Integer>, QueryDslPredicateExecutor<SubQuoteStage>{

}