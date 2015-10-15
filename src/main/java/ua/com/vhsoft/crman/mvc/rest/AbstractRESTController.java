package ua.com.vhsoft.crman.mvc.rest;

import java.util.List;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public interface AbstractRESTController<T> {
    
    T getByID(Integer id);
    List<T> getAll();
    List<T> getFilteredData();
    T createEntry(T entry);
    T editEntry(T entry);
    void deleteByID(Integer id);
    void deleteByObject(T object);
    
}
