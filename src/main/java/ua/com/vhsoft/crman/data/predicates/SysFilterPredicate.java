package ua.com.vhsoft.crman.data.predicates;

import com.mysema.query.types.expr.BooleanExpression;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.mvc.models.QSysFilter;
import ua.com.vhsoft.crman.mvc.models.SysUser;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Component
public class SysFilterPredicate implements AbstractPredicate {

    @Override
    public BooleanExpression filterById(Integer id) {
        return QSysFilter.sysFilter.filterId.eq(id);
    }

    @Override
    public BooleanExpression filterByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BooleanExpression filterByNameLike(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public BooleanExpression filterByUser(SysUser sysUser) {
        return QSysFilter.sysFilter.userId.eq(sysUser);
    }
   
    public BooleanExpression filterByUserAndTable(SysUser sysUser, String tableName) {
        return filterByUser(sysUser).and(QSysFilter.sysFilter.tableName.eq(tableName));
    }
    
}
