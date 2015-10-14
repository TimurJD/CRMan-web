package ua.com.vhsoft.crman.data.manipulators;

import com.mysema.query.types.expr.BooleanExpression;
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
     * @param sysUser
     * @return list of filter objects
     */
    public List<SysFilter> getFiltersByUser(SysUser sysUser){
        if (sysUser == null) {
            return null;
        }
        BooleanExpression filterByUser = sysFilterPredicate.filterByUser(sysUser);
        List<SysFilter> filter =  sysFilterService.findAll(filterByUser);
        return filter;
    }
    
    /**
     * Retrieve all filters for current user
     * 
     * @param sysUser
     * @param tableName
     * @return list of filter objects
     */
    public List<SysFilter> getFiltersByUserAndTable(SysUser sysUser, String tableName){
        if (sysUser == null) {
            return null;
        }
        return sysFilterService.findAll(sysFilterPredicate.filterByUserAndTable(sysUser, tableName));
    }
    
    
    
    //TODO add other CRUD methods
    
    
    
}
