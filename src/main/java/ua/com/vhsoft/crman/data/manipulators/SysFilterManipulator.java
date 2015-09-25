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
    @Autowired
    private SysUserManipulator sysUserManipulator;
    
    /**
     * Retrieve all filters for current user
     * 
     * @return list of filter objects
     */
    public List<SysFilter> getFiltersByUser(){
        SysUser sysUser = sysUserManipulator.getCurrentlyLoggedInUser();
        if (sysUser == null) {
            return null;
        }
        return sysFilterService.findAll(sysFilterPredicate.filterByUser(sysUser));
    }
    
    /**
     * Retrieve all filters for current user
     * 
     * @return list of filter objects
     */
    public List<SysFilter> getFiltersByUserAndTable(String tableName){
        SysUser sysUser = sysUserManipulator.getCurrentlyLoggedInUser();
        if (sysUser == null) {
            return null;
        }
        return sysFilterService.findAll(sysFilterPredicate.filterByUserAndTable(sysUser, tableName));
    }
    
    //TODO add other CRUD methods
    
    
    
}
