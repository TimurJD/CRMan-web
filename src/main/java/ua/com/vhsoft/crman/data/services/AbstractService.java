package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import java.util.List;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public interface AbstractService<T> {
    T addOrUpdate(T entity);
    List<T> findAll(Predicate predicate);
    List<T> findAll();
    void delete(T entity);
}
