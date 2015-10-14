package ua.com.vhsoft.crman.data.predicates;

import com.mysema.query.types.expr.BooleanExpression;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.mvc.models.QTblActivity;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Component
public class TblActivityPredicate implements AbstractPredicate {


    public BooleanExpression filterByName(String name) {
        return QTblActivity.tblActivity.title.eq(name);
    }

    public BooleanExpression filterByNameLike(String name) {
        return QTblActivity.tblActivity.title.like(name);
    }
    
}