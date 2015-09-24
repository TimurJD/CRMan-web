package ua.com.vhsoft.crman.data.manipulators;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.data.predicates.SysFilterPredicate;
import ua.com.vhsoft.crman.data.services.SysFilterService;
import ua.com.vhsoft.crman.mvc.models.SysFilter;
import ua.com.vhsoft.crman.mvc.models.SysUser;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Component
public class SysFilterManipulator {
    
    @Autowired
    private SysFilterService sysFilterService;
    @Autowired
    private SysFilterPredicate sysFilterPredicate;
    
    /**
     * Retrieve all filters for current user
     * 
     * @return list of filter objects
     */
    public List<SysFilter> getFiltersByUser(){
        SysUser sysUser = null;  //TODO get current logged in user
        return sysFilterService.findAll(sysFilterPredicate.filterByUser(sysUser));
    }
    
    //TODO add other CRUD methods
    
    
    
}
