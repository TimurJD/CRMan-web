package ua.com.vhsoft.crman.data.predicates;

import com.mysema.query.types.expr.BooleanExpression;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.mvc.models.QSysUser;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Component
public class SysUserPredicate implements AbstractPredicate {

    @Override
    public BooleanExpression filterById(Integer id) {
        return QSysUser.sysUser.userId.eq(id);
    }

    @Override
    public BooleanExpression filterByName(String name) {
        return QSysUser.sysUser.login.eq(name);
    }

    @Override
    public BooleanExpression filterByNameLike(String name) {
        return QSysUser.sysUser.login.like(name);
    }
    
}
