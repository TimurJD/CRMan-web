package ua.com.vhsoft.crman.data.predicates;

import com.mysema.query.types.expr.BooleanExpression;

/**
 * Marker interface for all predicates
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public interface AbstractPredicate {

    /**
     * ID filter
     *
     * @param id
     * @return predicate for specified id
     */
    BooleanExpression filterById(Integer id);

    /**
     * Name filter
     *
     * @param name
     * @return predicate for specified name
     */
    BooleanExpression filterByName(String name);

    /**
     * Name-like filter
     *
     * @param name
     * @return predicate for specified name part
     */
    BooleanExpression filterByNameLike(String name);

}
