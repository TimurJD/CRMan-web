package ua.com.vhsoft.crman.mvc.rest;

import java.util.List;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public interface AbstractRESTController<T> {
    
    T getByID(Integer id);
    List<T> getAll();
    T createEntry(T entry);
    T editEntry(T entry);
    T deleteByID(Integer id);
    T deleteByObject(T object);
    
}
