package ua.com.vhsoft.crman.data.predicates;

import org.springframework.stereotype.Component;

import com.mysema.query.types.expr.BooleanExpression;

import ua.com.vhsoft.crman.mvc.models.QTblAccount;

/**
 *
 * @author Timur Berezhnoi
 */
@Component
public class TblAccountPredicate implements AbstractPredicate {
    
    @Override
    public BooleanExpression filterById(Integer id) {
        return QTblAccount.tblAccount.accountId.eq(id);
    }

    @Override
    public BooleanExpression filterByName(String name) {
        return QTblAccount.tblAccount.accountName.eq(name);
    }

    @Override
    public BooleanExpression filterByNameLike(String name) {
        return QTblAccount.tblAccount.accountName.like(name);
    }
    
}