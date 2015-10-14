package ua.com.vhsoft.crman.data.predicates;

import com.mysema.query.types.expr.BooleanExpression;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.mvc.models.QTblAccount;

/**
 *
 * @author Timur Berezhnoi
 */
@Component
public class TblAccountPredicate implements AbstractPredicate {
  
    public BooleanExpression filterByName(String name) {
        return QTblAccount.tblAccount.accountName.eq(name);
    }

    public BooleanExpression filterByNameLike(String name) {
        return QTblAccount.tblAccount.accountName.like(name);
    }
    
}