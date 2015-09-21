package ua.com.vhsoft.crman.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import ua.com.vhsoft.crman.mvc.models.TblQuote;

/**
 * @author Timur Berezhnoi
 *
 */
public interface TblQuoteRepository extends JpaRepository<TblQuote, Integer>, QueryDslPredicateExecutor<TblQuote> {

}